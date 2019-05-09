package me.xujichang.luggagedelivery.ui.main.fragments;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.Collections;
import java.util.List;

import io.reactivex.observers.ResourceObserver;
import me.xujichang.luggagedelivery.base.BaseViewModel;
import me.xujichang.luggagedelivery.base.WrapperEntity;
import me.xujichang.luggagedelivery.base.WrapperList;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.db.AppDatabases;
import me.xujichang.luggagedelivery.db.DeptDao;
import me.xujichang.luggagedelivery.entity.Dept;
import me.xujichang.luggagedelivery.entity.Flow;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.net.api.OrderApi;
import me.xujichang.luggagedelivery.ui.App;
import me.xujichang.xbase.net.retrofit.RetrofitCenter;
import me.xujichang.xbase.net.rxjava.RxSchedulers;

public class OrderViewModel extends BaseViewModel {
    private static final String TAG = "OrderViewModel";
    private MutableLiveData<List<Order>> mOrderLiveData;
    private int mType;
    private Order mOrder;
    private DeptDao mDeptDao;
    private MutableLiveData<List<Flow>> mFlowLiveData;

    public MutableLiveData<List<Order>> getOrderLiveData() {
        return mOrderLiveData;
    }

    public void setOrderLiveData(MutableLiveData<List<Order>> pOrderLiveData) {
        mOrderLiveData = pOrderLiveData;
    }

    public Order getOrder() {
        return mOrder;
    }

    public void setOrder(Order pOrder) {
        mOrder = pOrder;
    }

    public MutableLiveData<List<Flow>> getFlowLiveData() {
        return mFlowLiveData;
    }

    public OrderViewModel(@NonNull Application application) {
        super(application);
        mOrderLiveData = new MutableLiveData<>();
        mFlowLiveData = new MutableLiveData<>();
        mDeptDao = AppDatabases.getInstance(application).mDeptDao();
    }

    public MutableLiveData<List<Order>> getOrders() {
        return mOrderLiveData;
    }

    public void loadOrders() {
        if (mType == 1) {
            loadOrdersSent();
        } else {
            loadOrdersRecv();
        }
    }

    private void loadOrdersRecv() {
        RetrofitCenter.getApi(OrderApi.class)
                .getOrdersRecv(App.sUser.getUserphone())
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperList<Order>>() {
                    @Override
                    public void onNext(WrapperList<Order> orderWrapperList) {
                        if (orderWrapperList.getCode() == 200) {
                            mOrderLiveData.setValue(orderWrapperList.getData());
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

    private void loadOrdersSent() {
        RetrofitCenter.getApi(OrderApi.class)
                .getOrdersSent(App.sUser.getUserphone())
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperList<Order>>() {
                    @Override
                    public void onNext(WrapperList<Order> orderWrapperList) {
                        if (orderWrapperList.getCode() == 200) {
                            mOrderLiveData.setValue(orderWrapperList.getData());
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

    public void setType(int type) {
        mType = type;
    }

    public int getType() {
        return mType;
    }

    public void searchOrder(long pKey, int flag) {
        RetrofitCenter.getApi(OrderApi.class)
                .searchOrder(pKey)
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperEntity<Order>>() {
                    @Override
                    public void onNext(WrapperEntity<Order> pOrderWrapperList) {
                        if (pOrderWrapperList.getCode() == 200) {
                            mOrderLiveData.setValue(Collections.singletonList(pOrderWrapperList.getData()));
                            mResultLiveData.setValue(new Result.Success(flag));
                        } else {
                            mResultLiveData.setValue(new Result.Error(pOrderWrapperList.toErrorString(), flag));
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

    public void getFlowLog() {
        RetrofitCenter.getApi(OrderApi.class)
                .getOrderFlow(mOrder.getId())
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperList<Flow>>() {
                    @Override
                    public void onNext(WrapperList<Flow> pOrderWrapperList) {
                        if (pOrderWrapperList.getCode() == 200) {
                            mFlowLiveData.setValue(pOrderWrapperList.getData());
                        } else {

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

    public void addOrder(Order pOrder, int flag) {
        RetrofitCenter.getApi(OrderApi.class)
                .addOrder(pOrder)
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperEntity<Void>>() {
                    @Override
                    public void onNext(WrapperEntity<Void> pVoidWrapperEntity) {
                        if (pVoidWrapperEntity.getCode() == 200) {
                            mResultLiveData.setValue(new Result.Success(flag));
                        } else {
                            mResultLiveData.setValue(new Result.Error(flag));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "onError: ");
                    }

                    @Override
                    public void onComplete() {
                        Log.i(TAG, "onComplete: ");
                    }
                });
    }

    public LiveData<List<Dept>> getDepts() {
        return mDeptDao.getAllDept();
    }
}
