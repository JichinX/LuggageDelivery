package me.xujichang.luggagedelivery.base.ui;

import androidx.fragment.app.Fragment;

import me.xujichang.luggagedelivery.base.BaseViewModel;
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
}
