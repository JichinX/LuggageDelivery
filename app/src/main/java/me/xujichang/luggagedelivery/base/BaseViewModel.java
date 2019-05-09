package me.xujichang.luggagedelivery.base;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import me.xujichang.luggagedelivery.data.Result;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.base
 *
 * @author xujichang
 * @date 2019-04-26 - 00:49
 * <p>
 * modify:
 */
public class BaseViewModel extends AndroidViewModel {
    protected MutableLiveData<Result> mResultLiveData;

    public BaseViewModel(@NonNull Application application) {
        super(application);
        mResultLiveData = new MutableLiveData<>();
    }

    public MutableLiveData<Result> getResult() {
        return mResultLiveData;
    }

    public void clearResult() {
        mResultLiveData.setValue(new Result.Empty());
    }
}
