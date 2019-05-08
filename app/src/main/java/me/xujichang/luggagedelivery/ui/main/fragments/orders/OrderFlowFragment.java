package me.xujichang.luggagedelivery.ui.main.fragments.orders;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.entity.Flow;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.ui.main.adapter.FlowsAdapter;
import me.xujichang.luggagedelivery.ui.main.fragments.OrderViewModel;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class OrderFlowFragment extends Fragment {

    private List<Flow> mFlows;
    private FlowsAdapter mFlowsAdapter;
    private RecyclerView rvFlows;
    private OrderViewModel mViewModel;
    private TextView mTvStart;
    private TextView mTvEnd;
    private RecyclerView mRvFlows;

    public OrderFlowFragment() {
        // Required empty public constructor
        mFlows = new ArrayList<>();
        mFlowsAdapter = new FlowsAdapter(mFlows);
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
        // Inflate the layout for this fragment
        return initView(inflater.inflate(R.layout.fragment_order_flow, container, false));
    }

    private View initView(View pInflate) {

        mTvStart = pInflate.findViewById(R.id.tv_start);
        mTvEnd = pInflate.findViewById(R.id.tv_end);
        rvFlows = pInflate.findViewById(R.id.rv_flows);

        rvFlows.setLayoutManager(new LinearLayoutManager(getContext()));
        rvFlows.setAdapter(mFlowsAdapter);

        return pInflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(getActivity()).get(OrderViewModel.class);

        mViewModel.getFlowLiveData().observe(getViewLifecycleOwner(), new Observer<List<Flow>>() {
            @Override
            public void onChanged(List<Flow> pFlows) {
                mFlows.clear();
                mFlows.addAll(pFlows);
                mFlowsAdapter.notifyDataSetChanged();
            }
        });
        patch(mViewModel.getOrder());
        mViewModel.getFlowLog();

    }

    private void patch(Order pOrder) {
        mTvStart.setText(String.valueOf(pOrder.getStartDeptId()));
        mTvEnd.setText(String.valueOf(pOrder.getEndDeptId()));
    }
}
