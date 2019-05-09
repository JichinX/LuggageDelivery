package me.xujichang.luggagedelivery.net.api;

import java.util.List;

import io.reactivex.Observable;
import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.luggagedelivery.base.WrapperList;
import me.xujichang.luggagedelivery.entity.Dept;
import retrofit2.http.GET;

public interface MainApi {
    String REMOTE_URL = Const.URL.BASE_URL;

    @GET("dept/all")
    Observable<WrapperList<Dept>> getDepts();
}
