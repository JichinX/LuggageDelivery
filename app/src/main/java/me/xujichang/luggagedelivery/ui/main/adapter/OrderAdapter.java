package me.xujichang.luggagedelivery.ui.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.Holder> implements IAdapterHelper {
    private List<Order> mOrders;
    private IItemCommonListener mCommonListener;
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

    @Override
    public void setOnItemClickListener(IItemCommonListener commonAdapter) {
        mCommonListener = commonAdapter;
    }

    @Override
    public void setHasMore(boolean hasMore) {
        mHasMore = hasMore;
    }

    class Holder extends RecyclerView.ViewHolder {

        private TextView mTvOrderStartPlace;
        private TextView mTvOrderEndPlace;
        private TextView mTvOrderStatus;
        private ImageView mIvOrderThings;
        private TextView mTvOrderRemark;
        private TextView mTvOrderLogistics;
        private TextView mTvOrderDelete;
        private TextView mTvOrderEdit;

        public Holder(@NonNull View itemView) {
            super(itemView);
            mTvOrderStartPlace = itemView.findViewById(R.id.tv_order_start_place);
            mTvOrderEndPlace = itemView.findViewById(R.id.tv_order_end_place);
            mTvOrderStatus = itemView.findViewById(R.id.tv_order_status);
            mIvOrderThings = itemView.findViewById(R.id.iv_order_things);
            mTvOrderRemark = itemView.findViewById(R.id.tv_order_remark);
            mTvOrderLogistics = itemView.findViewById(R.id.tv_order_logistics);
            mTvOrderDelete = itemView.findViewById(R.id.tv_order_delete);
            mTvOrderEdit = itemView.findViewById(R.id.tv_order_edit);
        }

        public void bindData(Order order) {
            mTvOrderStartPlace.setText(order.getStart());
            mTvOrderEndPlace.setText(order.getEnd());
            mTvOrderStatus.setText(order.getStatus());
            mIvOrderThings.setImageResource(R.drawable.ic_launcher_background);
            mTvOrderRemark.setText(order.getMark());
        }
    }
}
