package me.xujichang.luggagedelivery.net.api;

import java.security.PrivateKey;

import io.reactivex.Observable;
import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.luggagedelivery.base.WrapperEntity;
import me.xujichang.luggagedelivery.entity.User;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.net.api
 *
 * @author xujichang
 * @date 2019-05-04 - 18:01
 * <p>
 * modify:
 */

public interface UserApi {
    String REMOTE_URL = Const.URL.BASE_URL;

    @GET("user/login")
    public Observable<WrapperEntity<User>> login(@Query("uName") String uNmae, @Query("uPwd") String uPwd);

    @POST("user/update")
    public Observable<WrapperEntity<User>> updateInfo(@Body User pUser);
}
