package me.xujichang.luggagedelivery.ui;

import androidx.multidex.MultiDexApplication;

import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.luggagedelivery.entity.User;
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
public class App extends MultiDexApplication {
    public static User sUser;

    @Override
    public void onCreate() {
        super.onCreate();
        BaseNet mBaseNet = new BaseNet();
        mBaseNet.initFirst(this);
        RetrofitCenter.init(Const.URL.BASE_URL);
    }
}
