package me.xujichang.luggagedelivery.ui.main.fragments;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;

public class LogisticsFragment extends BaseFragment {

    private LogisticsViewModel mViewModel;

    public static LogisticsFragment newInstance() {
        return new LogisticsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_logistics, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LogisticsViewModel.class);
        // TODO: Use the ViewModel
    }

}
