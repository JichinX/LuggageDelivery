package me.xujichang.luggagedelivery.base.ui;

import android.widget.Toast;

import androidx.fragment.app.Fragment;

import me.xujichang.luggagedelivery.base.BaseViewModel;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.util.IViewModelHelper;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.base.ui
 *
 * @author xujichang
 * @date 2019-04-25 - 23:07
 * <p>
 * modify:
 */
public class BaseFragment extends Fragment implements IViewModelHelper {

    @Override
    public void registerLoading(BaseViewModel baseViewModel) {

    }

    protected void showTip(Result pResult, Result.CallBack pCallBack) {
        if (null == pResult) {
            return;
        }
        if (pResult instanceof Result.Empty) {
            return;
        }
        if (pResult instanceof Result.Success) {
            if (null != pCallBack) {
                pCallBack.onSuccess();
            }
            return;
        }
        if (pResult instanceof Result.Error) {
            Exception vException = ((Result.Error) pResult).getError();
            if (null != vException) {
                String msg = vException.getMessage();
                showToast(msg);
            }
        }
    }

    private void showToast(String pMsg) {
        Toast.makeText(getContext(), pMsg, Toast.LENGTH_SHORT).show();
    }
}
