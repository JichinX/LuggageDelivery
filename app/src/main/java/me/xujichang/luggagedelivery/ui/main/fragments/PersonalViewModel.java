package me.xujichang.luggagedelivery.ui.main.fragments;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import io.reactivex.observers.ResourceObserver;
import me.xujichang.luggagedelivery.base.BaseViewModel;
import me.xujichang.luggagedelivery.base.WrapperEntity;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.entity.User;
import me.xujichang.luggagedelivery.net.api.UserApi;
import me.xujichang.xbase.net.retrofit.RetrofitCenter;
import me.xujichang.xbase.net.rxjava.RxSchedulers;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.ui.main.fragments
 *
 * @author xujichang
 * @date 2019-05-07 - 18:05
 * <p>
 * modify:
 */
public class PersonalViewModel extends BaseViewModel {
    private MutableLiveData<User> mUserLiveData;

    public PersonalViewModel(@NonNull Application application) {
        super(application);
        mUserLiveData = new MutableLiveData<>();
    }

    public MutableLiveData<User> getUserLiveData() {
        return mUserLiveData;
    }

    public void updateUserInfo(User pUser, int flag) {
        RetrofitCenter.getApi(UserApi.class)
                .updateInfo(pUser)
                .compose(RxSchedulers.observableTransformer_io_main())
                .subscribe(new ResourceObserver<WrapperEntity<User>>() {
                    @Override
                    public void onNext(WrapperEntity<User> pEntity) {
                        if (pEntity.getCode() == 200) {
                            mUserLiveData.setValue(pEntity.getData());
                            mResultLiveData.setValue(new Result.Success(flag));
                        } else {
                            mResultLiveData.setValue(new Result.Error(pEntity.toErrorString(), flag));
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
