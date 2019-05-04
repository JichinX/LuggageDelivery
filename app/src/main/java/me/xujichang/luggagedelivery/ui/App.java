package me.xujichang.luggagedelivery.ui;

import android.app.Application;

import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.xbase.net.BaseNet;
import me.xujichang.xbase.net.retrofit.RetrofitCenter;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.ui
 *
 * @author xujichang
 * @date 2019-04-25 - 22:40
 * <p>
 * modify:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BaseNet mBaseNet = new BaseNet();
        mBaseNet.initFirst(this);
        RetrofitCenter.init(Const.URL.BASE_URL);
    }
}
