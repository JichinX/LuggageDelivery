package me.xujichang.luggagedelivery.ui.main.fragments.comments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;
import me.xujichang.luggagedelivery.entity.Comment;
import me.xujichang.luggagedelivery.ui.main.adapter.CommentsAdapter;
import me.xujichang.luggagedelivery.ui.main.fragments.CommentViewModel;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class CommentMainFragment extends BaseFragment {
    private RecyclerView mRvComments;
    private FloatingActionButton mFlbCommentOperate;
    private List<Comment> mComments;
    private CommentsAdapter mCommensAdapter;
    private CommentViewModel mViewModel;
    private SwipeRefreshLayout mSrlComment;
    private String comment;

    public CommentMainFragment() {
        // Required empty public constructor
        mComments = new ArrayList<>();
        mCommensAdapter = new CommentsAdapter(mComments);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return initView(inflater.inflate(R.layout.fragment_comment_main, container, false));

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(getActivity()).get(CommentViewModel.class);

        mViewModel.subscribeComments().observe(getViewLifecycleOwner(), new Observer<List<Comment>>() {
            @Override
            public void onChanged(List<Comment> comments) {
                mSrlComment.setRefreshing(false);
                mComments.clear();
                mComments.addAll(comments);
                mCommensAdapter.notifyDataSetChanged();
            }
        });
        mViewModel.loadComments();
    }

    private View initView(View inflate) {
        mRvComments = inflate.findViewById(R.id.rv_comments);
        mFlbCommentOperate = inflate.findViewById(R.id.flb_comment_operate);
        mSrlComment = inflate.findViewById(R.id.srl_comment);

        mRvComments.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvComments.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        mRvComments.setAdapter(mCommensAdapter);

        mSrlComment.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //刷新数据
                mViewModel.loadComments();
            }
        });
        mFlbCommentOperate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //添加评论
                showCommentSubmitDialog();
            }
        });
        return inflate;
    }

    private void showCommentSubmitDialog() {
        MaterialDialog.Builder vBuilder =
                new MaterialDialog.Builder(getContext())
                        .title("输入反馈内容")
                        .input("请输入反馈信息", "", false, new MaterialDialog.InputCallback() {
                            @Override
                            public void onInput(@NonNull MaterialDialog dialog, CharSequence input) {
                                comment = input.toString();
                            }
                        })
                        .onAny(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                if (which == DialogAction.POSITIVE) {
                                    mViewModel.uploadComment(comment);
                                }
                                dialog.dismiss();
                            }
                        })
                        .positiveText("确定")
                        .negativeText("取消")
                        .autoDismiss(false)
                        .cancelable(false);
        MaterialDialog vDialog = vBuilder.build();
        vDialog.show();
    }
}
