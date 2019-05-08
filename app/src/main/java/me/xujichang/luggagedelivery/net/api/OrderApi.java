package me.xujichang.luggagedelivery.net.api;

import io.reactivex.Completable;
import io.reactivex.Observable;
import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.luggagedelivery.base.WrapperEntity;
import me.xujichang.luggagedelivery.base.WrapperList;
import me.xujichang.luggagedelivery.entity.Flow;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.entity.User;
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
public interface OrderApi {
    String REMOTE_URL = Const.URL.BASE_URL;

    @GET("order/sent")
    public Observable<WrapperList<Order>> getOrdersSent(@Query("phone") String phone);

    @GET("order/recv")
    public Observable<WrapperList<Order>> getOrdersRecv(@Query("phone") String phone);

    @GET("order/id")
    public Observable<WrapperEntity<Order>> searchOrder(@Query("id") long id);

    @GET("order/flow")
    Observable<WrapperList<Flow>> getOrderFlow(@Query("id") long orderId);

    @POST("order/add")
    Observable<WrapperEntity<Void>> addOrder(@Body Order pOrder);
}
