package me.xujichang.luggagedelivery.ui.login;

import android.app.Application;
import android.util.Patterns;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.security.NoSuchAlgorithmException;

import io.reactivex.observers.ResourceObserver;
import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.BaseViewModel;
import me.xujichang.luggagedelivery.base.ErrorWrapper;
import me.xujichang.luggagedelivery.base.WrapperEntity;
import me.xujichang.luggagedelivery.db.AppDatabases;
import me.xujichang.luggagedelivery.db.UserDao;
import me.xujichang.luggagedelivery.entity.User;
import me.xujichang.luggagedelivery.net.api.UserApi;
import me.xujichang.luggagedelivery.ui.App;
import me.xujichang.luggagedelivery.util.PrefUtil;
import me.xujichang.util.tool.StringTool;
import me.xujichang.xbase.net.retrofit.RetrofitCenter;
import me.xujichang.xbase.net.rxjava.RxSchedulers;

public class LoginViewModel extends BaseViewModel {

    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<WrapperEntity<User>> loginResult = new MutableLiveData<>();
    private UserDao mUserDao;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        mUserDao = AppDatabases.getInstance(application).mUserDao();
    }

    LiveData<LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    LiveData<WrapperEntity<User>> getLoginResult() {
        return loginResult;
    }

    public void login(String username, String password, boolean auto) {
        // can be launched in a separate asynchronous job

        ResourceObserver<WrapperEntity<User>> mObserver = new ResourceObserver<WrapperEntity<User>>() {
            @Override
            public void onNext(WrapperEntity<User> userWrapperEntity) {
                if (userWrapperEntity.getCode() == 200) {
                    loginResult.setValue(userWrapperEntity);
                    App.sUser = userWrapperEntity.getData();
                    mUserDao.addUser(App.sUser);
                    PrefUtil.putLoginUserId(getApplication(), App.sUser.getUserid());
                }
            }

            @Override
            public void onError(Throwable e) {
                loginResult.setValue(new ErrorWrapper(e));
            }

            @Override
            public void onComplete() {
            }
        };
        String realPwd = null;
        if (!auto) {
            try {
                realPwd = StringTool.getMD5(password);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        } else {
            realPwd = password;
        }
        RetrofitCenter.getApi(UserApi.class)
                .login(username, realPwd)
                .compose(RxSchedulers.<WrapperEntity<User>>observableTransformer_io_main())
                .subscribe(mObserver);
    }

    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new LoginFormState(null, R.string.invalid_password));
        } else {
            loginFormState.setValue(new LoginFormState(true));
        }
    }

    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }

    public void autoLogin() {
        User vUser = mUserDao.getUser(PrefUtil.getLoginUserId(getApplication()));
        App.sUser = vUser;
        login(vUser.getUname(), vUser.getUserpassword(), true);
    }
}
