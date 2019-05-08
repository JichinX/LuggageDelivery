package me.xujichang.luggagedelivery;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.databinding.FragmentOrderAddBinding;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.ui.main.fragments.OrderViewModel;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderAddFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderAddFragment extends Fragment {
    private FragmentOrderAddBinding mAddBinding;
    private OrderViewModel mViewModel;
    private Order mOrder = new Order();

    public OrderAddFragment() {
        // Required empty public constructor
    }

    public static OrderAddFragment newInstance(String param1, String param2) {
        OrderAddFragment fragment = new OrderAddFragment();
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
        mAddBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_order_add, container, false);
        mAddBinding.setFragment(this);
        mAddBinding.setOrder(mOrder);
        return mAddBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(getActivity()).get(OrderViewModel.class);

        mViewModel.getResult().observe(getViewLifecycleOwner(), new Observer<Result>() {
            @Override
            public void onChanged(Result pResult) {
                if (pResult.getFlag() == Const.Flag.ORDER_ADD) {
                    if (pResult instanceof Result.Success) {
                        NavHostFragment.findNavController(getParentFragment()).navigateUp();
                    }
                }
            }
        });
    }

    /**
     * 添加 订单
     *
     * @param pOrder
     */
    public void addOrder(Order pOrder) {
        mViewModel.addOrder(pOrder, 100);
    }
}
