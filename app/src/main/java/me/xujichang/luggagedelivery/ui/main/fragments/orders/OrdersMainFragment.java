package me.xujichang.luggagedelivery.ui.main.fragments.orders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.ui.main.adapter.OrderAdapter;
import me.xujichang.luggagedelivery.ui.main.fragments.OrderViewModel;
import me.xujichang.luggagedelivery.util.IItemCommonListener;

public class OrdersMainFragment extends BaseFragment {
    private OrderViewModel mViewModel;
    private RecyclerView mRvOrders;
    private FloatingActionButton mFlbOperate;
    private List<Order> mOrders;
    private OrderAdapter mOrderAdapter;
    private int currentPage = 1;

    public static OrdersMainFragment newInstance() {
        return new OrdersMainFragment();
    }

    public OrdersMainFragment() {
        mOrders = new ArrayList<>();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return initView(inflater.inflate(R.layout.fragment_orders_main, container, false));
    }


    private View initView(View inflate) {
        mOrderAdapter = new OrderAdapter(mOrders);
        mRvOrders = inflate.findViewById(R.id.rv_orders);
        mFlbOperate = inflate.findViewById(R.id.flb_operate);
        mRvOrders.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvOrders.setAdapter(mOrderAdapter);
        mRvOrders.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        mOrderAdapter.setOnItemClickListener(new IItemCommonListener() {
            @Override
            public void onLoadMore(int position, Object data) {
                //加载更多
            }

            @Override
            public void onItemClick(int position, Object data) {
                //单击
            }

            @Override
            public void onItemLongClick(int position, Object data) {
                //长按
            }
        });
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(getActivity()).get(OrderViewModel.class);
        registerLoading(mViewModel);
        //获取列表
        mViewModel.getOrders().observe(getViewLifecycleOwner(), new Observer<List<Order>>() {
            @Override
            public void onChanged(List<Order> orders) {
                if (currentPage == 1) {
                    mOrders.clear();
                }
                mOrders.addAll(orders);
                mOrderAdapter.notifyDataSetChanged();
            }
        });
        mViewModel.getResult().observe(getViewLifecycleOwner(), new Observer<Result>() {
            @Override
            public void onChanged(Result result) {

            }
        });
        loadData();
    }

    private void loadData() {
        mViewModel.loadOrders(currentPage);
    }
}
