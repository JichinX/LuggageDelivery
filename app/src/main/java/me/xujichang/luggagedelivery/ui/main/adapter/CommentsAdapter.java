package me.xujichang.luggagedelivery.ui.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.entity.Comment;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.ui.main.adapter
 *
 * @author xujichang
 * @date 2019-05-07 - 22:27
 * <p>
 * modify:
 */
public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.Hodler> {
    private List<Comment> mComments;

    public CommentsAdapter(List<Comment> comments) {
        mComments = comments;
    }

    @NonNull
    @Override
    public CommentsAdapter.Hodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Hodler(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comments, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CommentsAdapter.Hodler holder, int position) {
        holder.bindData(mComments.get(position));
    }

    @Override
    public int getItemCount() {
        return mComments.size();
    }

    class Hodler extends RecyclerView.ViewHolder {

        private TextView mTvTime;
        private TextView mTvContent;

        public Hodler(@NonNull View itemView) {
            super(itemView);
            mTvTime = itemView.findViewById(R.id.tv_time);
            mTvContent = itemView.findViewById(R.id.tv_content);
        }

        public void bindData(Comment comment) {
            mTvTime.setText(comment.getAdddate());
            mTvContent.setText(comment.getContent());
        }
    }
}
