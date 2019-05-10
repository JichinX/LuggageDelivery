package me.xujichang.luggagedelivery;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.fragment.NavHostFragment;

import com.google.common.base.Strings;

import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.databinding.FragmentOrderAddBinding;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.ui.App;
import me.xujichang.luggagedelivery.ui.main.fragments.OrderViewModel;
import me.xujichang.luggagedelivery.util.DeptUtil;
import me.xujichang.util.tool.StringTool;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderAddFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderAddFragment extends BaseFragment {
    private FragmentOrderAddBinding mAddBinding;
    private OrderViewModel mViewModel;
    private Order mOrder = new Order();
    private SpinnerAdapter mSpinnerAdapter;

    public OrderAddFragment() {
        mOrder.setFromuserphone(App.sUser.getUserphone());
        mOrder.setFromusername(App.sUser.getUsername());
        mOrder.setFromuseraddress(App.sUser.getUseraddress());

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
        mSpinnerAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, DeptUtil.sDepts);
        mViewModel = ViewModelProviders.of(getActivity()).get(OrderViewModel.class);

        mViewModel.getResult().observe(getViewLifecycleOwner(), new Observer<Result>() {
            @Override
            public void onChanged(Result pResult) {
                showTip(mViewModel, pResult, Const.Flag.ORDER_ADD, new Result.CallBack() {
                    @Override
                    public void onSuccess() {
                        NavHostFragment.findNavController(getParentFragment()).navigateUp();
                    }
                });
            }
        });
        mAddBinding.spinnerOrderDept.setAdapter(mSpinnerAdapter);
    }


    /**
     * 添加 订单
     *
     * @param pOrder
     */
    public void addOrder(Order pOrder) {
        //检查参数
        String weight = mAddBinding.etOrderWeight.getText().toString();
        if (Strings.isNullOrEmpty(weight)) {
            showToast("物品重量不能为空");
            return;
        }
        if (Strings.isNullOrEmpty(pOrder.getAddress()) || Strings.isNullOrEmpty(pOrder.getFromuseraddress())) {
            showToast("地址信息不能为空");
            return;
        }
        if (Strings.isNullOrEmpty(pOrder.getGoodsname())) {
            showToast("物品名称不能为空");
            return;
        }
        if (Strings.isNullOrEmpty(pOrder.getFromusername()) || Strings.isNullOrEmpty(pOrder.getUsername())) {
            showToast("用户姓名不能为空");
            return;
        }
        if (Strings.isNullOrEmpty(pOrder.getUserphone()) || Strings.isNullOrEmpty(pOrder.getFromuserphone())) {
            showToast("收集信息不能为空");
            return;
        }
        pOrder.setGoodsweight(Double.parseDouble(mAddBinding.etOrderWeight.getText().toString()));
        mViewModel.addOrder(pOrder, 100);
    }
}
