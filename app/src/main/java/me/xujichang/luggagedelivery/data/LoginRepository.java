package me.xujichang.luggagedelivery.data;

import java.security.NoSuchAlgorithmException;

import io.reactivex.observers.ResourceObserver;
import me.xujichang.luggagedelivery.base.WrapperEntity;
import me.xujichang.luggagedelivery.data.model.LoggedInUser;
import me.xujichang.luggagedelivery.entity.User;
import me.xujichang.luggagedelivery.net.api.UserApi;
import me.xujichang.util.tool.StringTool;
import me.xujichang.xbase.net.retrofit.RetrofitCenter;
import me.xujichang.xbase.net.rxjava.RxSchedulers;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class LoginRepository {

    private static volatile LoginRepository instance;

    private LoginDataSource dataSource;

    // If user credentials will be cached in local storage, it is recommended it be encrypted
    // @see https://developer.android.com/training/articles/keystore
    private LoggedInUser user = null;

    // private constructor : singleton access
    private LoginRepository(LoginDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static LoginRepository getInstance(LoginDataSource dataSource) {
        if (instance == null) {
            instance = new LoginRepository(dataSource);
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    public void logout() {
        user = null;
        dataSource.logout();
    }

    private void setLoggedInUser(LoggedInUser user) {
        this.user = user;
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }

    public void login(String username, String password, ResourceObserver<WrapperEntity<User>> observer) {
//        String realName = null;
        String realPwd = null;
        try {
//            realName = StringTool.getMD5(username);
            realPwd = StringTool.getMD5(password);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        RetrofitCenter.getApi(UserApi.class)
                .login(username, realPwd)
                .compose(RxSchedulers.<WrapperEntity<User>>observableTransformer_io_main())
                .subscribe(observer);
    }
}
