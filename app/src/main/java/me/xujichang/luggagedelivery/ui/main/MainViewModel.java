package me.xujichang.luggagedelivery.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.List;

import io.reactivex.observers.ResourceObserver;
import me.xujichang.luggagedelivery.base.WrapperList;
import me.xujichang.luggagedelivery.db.AppDatabases;
import me.xujichang.luggagedelivery.db.DeptDao;
import me.xujichang.luggagedelivery.entity.Dept;
import me.xujichang.luggagedelivery.net.api.MainApi;
import me.xujichang.luggagedelivery.util.DeptUtil;
import me.xujichang.xbase.net.retrofit.RetrofitCenter;
import me.xujichang.xbase.net.rxjava.RxSchedulers;

public class MainViewModel extends AndroidViewModel {
    private DeptDao mDeptDao;

    public MainViewModel(@NonNull Application application) {
        super(application);
        mDeptDao = AppDatabases.getInstance(application).mDeptDao();
    }

    /**
     * 准备数据
     */
    public void prepareData() {
        RetrofitCenter.getApi(MainApi.class)
                .getDepts()
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperList<Dept>>() {
                    @Override
                    public void onNext(WrapperList<Dept> pList) {
                        //
                        if (pList.getCode() == 200) {
                            mDeptDao.addDepts(pList.getData());
                            DeptUtil.patchDepts(pList.getData());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
