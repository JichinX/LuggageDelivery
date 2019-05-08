package me.xujichang.luggagedelivery.ui.main.fragments;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.reactivex.observers.ResourceObserver;
import me.xujichang.luggagedelivery.base.BaseViewModel;
import me.xujichang.luggagedelivery.base.WrapperList;
import me.xujichang.luggagedelivery.entity.Comment;
import me.xujichang.luggagedelivery.entity.Order;
import me.xujichang.luggagedelivery.net.api.CommentApi;
import me.xujichang.luggagedelivery.ui.App;
import me.xujichang.util.tool.StringTool;
import me.xujichang.xbase.net.retrofit.RetrofitCenter;
import me.xujichang.xbase.net.rxjava.RxSchedulers;

public class CommentViewModel extends BaseViewModel {
    private MutableLiveData<List<Comment>> mCommentsLiveData;

    public CommentViewModel(@NonNull Application application) {
        super(application);
        mCommentsLiveData = new MutableLiveData<>();
    }

    public void loadComments() {
        RetrofitCenter.getApi(CommentApi.class)
                .getAllFeedbacks(App.sUser.getUserphone())
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperList<Comment>>() {
                    @Override
                    public void onNext(WrapperList<Comment> orderWrapperList) {
                        if (orderWrapperList.getCode() == 200) {
                            mCommentsLiveData.setValue(orderWrapperList.getData());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public MutableLiveData<List<Comment>> subscribeComments() {
        return mCommentsLiveData;
    }

    public void uploadComment(String pComment) {
        long ms = System.currentTimeMillis();
        Comment vComment = new Comment();
        vComment.setId(ms);
        vComment.setUserphone(App.sUser.getUserphone());
        vComment.setContent(pComment);
        vComment.setAdddate(StringTool.formatTime(ms));
        RetrofitCenter.getApi(CommentApi.class)
                .addFeedBack(vComment)
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperList<Comment>>() {
                    @Override
                    public void onNext(WrapperList<Comment> orderWrapperList) {
                        if (orderWrapperList.getCode() == 200) {
                            mCommentsLiveData.setValue(orderWrapperList.getData());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
