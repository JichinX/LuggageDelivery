package me.xujichang.luggagedelivery.ui.main.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;

public class OrderFragment extends BaseFragment {
    private static final String TAG = "OrderFragment";
    /**
     * 1 寄件 2 收件
     */
    private int type;

    public OrderFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (null != getArguments()) {
            int type = getArguments().getInt("orderType");
            Log.i(TAG, "onCreate: orderType - " + type);
            OrderViewModel mViewModel = ViewModelProviders.of(getActivity()).get(OrderViewModel.class);
            mViewModel.setType(type);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View vView = inflater.inflate(R.layout.fragment_order, container, false);
        return vView;
    }
}
