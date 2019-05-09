package me.xujichang.luggagedelivery.ui.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.entity.Dept;
import me.xujichang.luggagedelivery.entity.Flow;
import me.xujichang.luggagedelivery.util.DeptUtil;

public class FlowsAdapter extends RecyclerView.Adapter<FlowsAdapter.Holder> {
    private List<Flow> mFlows;

    public FlowsAdapter(List<Flow> pFlows) {
        mFlows = pFlows;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flows, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bindData(mFlows.get(position));
    }

    @Override
    public int getItemCount() {
        return mFlows.size();
    }

    class Holder extends RecyclerView.ViewHolder {


        private TextView mTvDept;
        private TextView mTvStatus;
        private TextView mTvDate;

        public Holder(@NonNull View itemView) {
            super(itemView);
            mTvDept = itemView.findViewById(R.id.tv_dept);
            mTvStatus = itemView.findViewById(R.id.tv_status);
            mTvDate = itemView.findViewById(R.id.tv_date);

        }

        public void bindData(Flow pFlow) {

            mTvDept.setText(String.format("【%s】 - ", DeptUtil.getDept(pFlow.getDeptId())));
            mTvDate.setText(pFlow.getAdddate());
            mTvStatus.setText(pFlow.getNote());
        }
    }
}
