package me.xujichang.luggagedelivery.ui.main.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;

public class OrderFragment extends BaseFragment {


    public static OrderFragment newInstance() {
        return new OrderFragment();
    }

    private OrderFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_order, container, false);
    }
}
