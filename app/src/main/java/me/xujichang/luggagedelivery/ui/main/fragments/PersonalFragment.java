package me.xujichang.luggagedelivery.ui.main.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;
import me.xujichang.luggagedelivery.databinding.FragmentPersonalBinding;
import me.xujichang.luggagedelivery.entity.User;
import me.xujichang.luggagedelivery.ui.App;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.ui.main.fragments
 *
 * @author xujichang
 * @date 2019-05-07 - 18:04
 * <p>
 * modify:
 */
public class PersonalFragment extends BaseFragment {

    private static final String TAG = "PersonalFragment";
    private PersonalViewModel mViewModel;
    private FragmentPersonalBinding mBinding;

    public static PersonalFragment newInstance() {
        return new PersonalFragment();
    }

    public PersonalFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_personal, container, false);
        mBinding.setUser(App.sUser);
        mBinding.setPersonalFragement(this);
        mBinding.fabEnableEdit.setTag(false);
        initDefault(false);
        return mBinding.getRoot();
    }

    private void initDefault(boolean enable) {
        mBinding.etPersonLoc.setEnabled(enable);
        mBinding.etPersonMail.setEnabled(enable);
        mBinding.etPersonNewPwd.setEnabled(enable);
        mBinding.etPersonPhone.setEnabled(enable);
        mBinding.etPersonPwd.setEnabled(enable);
        mBinding.etPersonUname.setEnabled(enable);
        mBinding.etPersonUserName.setEnabled(enable);
        mBinding.etPersonBirth.setEnabled(enable);
        mBinding.spinnerPersonGender.setEnabled(enable);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(this).get(PersonalViewModel.class);
    }

    public void onFlabClick(View view) {
        boolean enable = (boolean) view.getTag();
        view.setTag(!enable);
        initDefault(!enable);
        User vUser = mBinding.getUser();
        Log.i(TAG, "onFlabClick: " + vUser);
    }
}
