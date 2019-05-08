package me.xujichang.luggagedelivery.ui.main.fragments.orders;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.ui.main.adapter.IOrderAdapterListener;
import me.xujichang.luggagedelivery.ui.main.adapter.OrderAdapter;
import me.xujichang.luggagedelivery.ui.main.fragments.OrderViewModel;
import me.xujichang.luggagedelivery.widget.SearchEditText;

public class OrdersMainFragment extends BaseFragment {
    private static final String TAG = "OrdersMainFragment";
    private OrderViewModel mViewModel;
    private RecyclerView mRvOrders;
    private FloatingActionButton mFlbAddOrder;
    private List<Order> mOrders;
    private OrderAdapter mOrderAdapter;
    private SwipeRefreshLayout mSflOrders;
    private SearchEditText mEtOrderSearch;

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
        mFlbAddOrder = inflate.findViewById(R.id.flb_add_order);
        mSflOrders = inflate.findViewById(R.id.sfl_orders);
        mEtOrderSearch = inflate.findViewById(R.id.et_order_search);

        mRvOrders.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvOrders.setAdapter(mOrderAdapter);
        mRvOrders.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        mOrderAdapter.setOnItemClickListener(new IOrderAdapterListener<Order>() {
            @Override
            public void onDetail(Order src) {
                mViewModel.setOrder(src);
                NavHostFragment.findNavController(getParentFragment()).navigate(R.id.action_order_detail);
            }

            @Override
            public void onFlow(Order src) {
                mViewModel.setOrder(src);
                NavHostFragment.findNavController(getParentFragment()).navigate(R.id.action_order_flow);
            }
        });
        mSflOrders.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //刷新
                mViewModel.loadOrders();
            }
        });
        mEtOrderSearch.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        mEtOrderSearch.setOnSearchListener(new SearchEditText.OnSearchListener() {
            @Override
            public void onSearch(String key) {
                //搜索
                mViewModel.searchOrder(Long.parseLong(key));
            }
        });
        mFlbAddOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //添加寄件
                Navigation.findNavController(v).navigate(R.id.action_order_add);
            }
        });
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    @SuppressLint("RestrictedApi")
    private void initViewModel() {
        mViewModel = ViewModelProviders.of(getActivity()).get(OrderViewModel.class);
        registerLoading(mViewModel);
        //获取列表
        mViewModel.getOrders().observe(getViewLifecycleOwner(), new Observer<List<Order>>() {
            @Override
            public void onChanged(List<Order> orders) {
                mOrders.clear();
                mOrders.addAll(orders);
                mOrderAdapter.notifyDataSetChanged();
                mSflOrders.setRefreshing(false);
            }
        });
        mViewModel.getResult().observe(getViewLifecycleOwner(), new Observer<Result>() {
            @Override
            public void onChanged(Result result) {

            }
        });
        mFlbAddOrder.setVisibility(mViewModel.getType() == 1 ? View.VISIBLE : View.GONE);
        loadData();
    }

    private void loadData() {
        mViewModel.loadOrders();
    }

}
