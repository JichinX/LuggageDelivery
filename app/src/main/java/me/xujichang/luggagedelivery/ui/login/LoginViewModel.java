package me.xujichang.luggagedelivery.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.util.Patterns;

import io.reactivex.observers.ResourceObserver;
import me.xujichang.luggagedelivery.base.ErrorWrapper;
import me.xujichang.luggagedelivery.base.WrapperEntity;
import me.xujichang.luggagedelivery.data.LoginRepository;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.data.model.LoggedInUser;
import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.entity.User;
import me.xujichang.luggagedelivery.net.api.UserApi;
import me.xujichang.xbase.net.retrofit.RetrofitCenter;
import me.xujichang.xbase.net.rxjava.RxSchedulers;

public class LoginViewModel extends ViewModel {

    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<WrapperEntity<User>> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    LiveData<LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    LiveData<WrapperEntity<User>> getLoginResult() {
        return loginResult;
    }

    public void login(String username, String password) {
        // can be launched in a separate asynchronous job

             ResourceObserver<WrapperEntity<User>> mObserver =  new ResourceObserver<WrapperEntity<User>>() {
                    @Override
                    public void onNext(WrapperEntity<User> userWrapperEntity) {
                        loginResult.setValue(userWrapperEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        loginResult.setValue(new ErrorWrapper(e));
                    }

                    @Override
                    public void onComplete() {
                    }
                };
        loginRepository.login(username, password,mObserver);
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
}
