package me.xujichang.luggagedelivery.net.api;

import io.reactivex.Observable;
import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.luggagedelivery.base.WrapperList;
import me.xujichang.luggagedelivery.entity.Comment;
import me.xujichang.luggagedelivery.entity.Order;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.net.api
 *
 * @author xujichang
 * @date 2019-05-07 - 21:58
 * <p>
 * modify:
 */
public interface CommentApi {
    String REMOTE_URL = Const.URL.BASE_URL;

    @POST("feedback/add")
    Observable<WrapperList<Comment>> addFeedBack(@Body Comment pComment);

    @GET("feedback/all")
    Observable<WrapperList<Comment>> getAllFeedbacks(@Query("phone") String phone);
}
