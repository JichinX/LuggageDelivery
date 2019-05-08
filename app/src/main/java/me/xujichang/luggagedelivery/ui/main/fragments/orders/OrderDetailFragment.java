package me.xujichang.luggagedelivery.ui.main.fragments.orders;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.databinding.FragmentOrderDetailBinding;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.ui.main.fragments.OrderViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderDetailFragment extends Fragment {

    private OrderViewModel mOrderViewModel;
    private FragmentOrderDetailBinding mDetailBinding;

    public OrderDetailFragment() {
        // Required empty public constructor
    }

    public static OrderDetailFragment newInstance(String param1, String param2) {
        OrderDetailFragment fragment = new OrderDetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mDetailBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_order_detail, container, false);

        return mDetailBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    private void initViewModel() {
        mOrderViewModel = ViewModelProviders.of(getActivity()).get(OrderViewModel.class);
        patch(mOrderViewModel.getOrder());
    }

    private void patch(Order pOrder) {
        mDetailBinding.setOrder(pOrder);
    }
}
