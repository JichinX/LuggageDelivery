package me.xujichang.luggagedelivery.ui.main.fragments;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.xujichang.luggagedelivery.base.BaseViewModel;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.entity.Order;

public class OrderViewModel extends BaseViewModel {
    private MutableLiveData<List<Order>> mOrderLiveData;

    public OrderViewModel(@NonNull Application application) {
        super(application);
        mOrderLiveData = new MutableLiveData<>();
    }

    public MutableLiveData<List<Order>> getOrders() {
        return mOrderLiveData;
    }

    public void loadOrders(int currentPage) {
        List<Order> mOrders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Order mOrder = new Order();
            mOrder.setStart("上海");
            mOrder.setEnd("天津");
            mOrder.setMark("危险物品");
            mOrder.setStatus("已接单");
            mOrders.add(mOrder);
        }
        mOrderLiveData.setValue(mOrders);
    }
}
