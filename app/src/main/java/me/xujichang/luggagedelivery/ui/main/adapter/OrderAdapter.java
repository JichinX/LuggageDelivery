package me.xujichang.luggagedelivery.ui.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.util.IAdapterHelper;
import me.xujichang.luggagedelivery.util.IItemCommonListener;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.ui.main.adapter
 *
 * @author xujichang
 * @date 2019-04-26 - 01:04
 * <p>
 * modify:
 */
public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.Holder> {
    private List<Order> mOrders;
    private IOrderAdapterListener<Order> mCommonListener;
    private boolean mHasMore = false;

    public OrderAdapter(List<Order> orders) {
        mOrders = orders;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_orders, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bindData(mOrders.get(position));
    }

    @Override
    public int getItemCount() {
        return mOrders.size();
    }

    public void setOnItemClickListener(IOrderAdapterListener<Order> commonAdapter) {
        mCommonListener = commonAdapter;
    }

    class Holder extends RecyclerView.ViewHolder {


        private TextView mTvOrderId;
        private TextView mTvGoodsName;
        private TextView mTvOrderTime;
        private TextView mTvOrderStatus;
        private TextView mTvDetail;
        private TextView mTvFlow;

        public Holder(@NonNull View itemView) {
            super(itemView);

            mTvOrderId = itemView.findViewById(R.id.tv_order_id);
            mTvGoodsName = itemView.findViewById(R.id.tv_goods_name);
            mTvOrderTime = itemView.findViewById(R.id.tv_order_time);
            mTvOrderStatus = itemView.findViewById(R.id.tv_order_status);
            mTvDetail = itemView.findViewById(R.id.tv_detail);
            mTvFlow = itemView.findViewById(R.id.tv_flow);


        }

        public void bindData(Order order) {
            mTvOrderId.setText(String.format("订单号：%s", String.valueOf(order.getId())));
            mTvGoodsName.setText(String.format("物件名称：%s", order.getGoodsname()));
            mTvOrderTime.setText(order.getAdddate());
            mTvOrderStatus.setText(order.getOrderstatus());

            mTvDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //查看详情
                    if (null != mCommonListener) {
                        mCommonListener.onDetail(order);
                    }
                }
            });
            mTvFlow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //查看物流
                    if (null != mCommonListener) {
                        mCommonListener.onFlow(order);
                    }
                }
            });

        }
    }
}
