package me.xujichang.luggagedelivery.ui.main.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.Const;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;
import me.xujichang.luggagedelivery.data.Result;
import me.xujichang.luggagedelivery.databinding.FragmentPersonalBinding;
import me.xujichang.luggagedelivery.entity.User;
import me.xujichang.luggagedelivery.ui.App;
import me.xujichang.luggagedelivery.ui.login.LoginActivity;
import me.xujichang.luggagedelivery.util.PrefUtil;

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

    @SuppressLint("RestrictedApi")
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
        mBinding.fabEnableApply.setVisibility(enable ? View.VISIBLE : View.GONE);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewModel();
    }

    private void initViewModel() {
        mViewModel = ViewModelProviders.of(this).get(PersonalViewModel.class);

        mViewModel.getUserLiveData().observe(getViewLifecycleOwner(), new Observer<User>() {
            @Override
            public void onChanged(User pUser) {
                mBinding.setUser(pUser);
            }
        });
        mViewModel.getResult().observe(getViewLifecycleOwner(), new Observer<Result>() {
            @Override
            public void onChanged(Result pResult) {
                if (pResult.getFlag() == Const.Flag.INFO_UPDATE) {
                    initDefault(false);
                    mViewModel.clearResult();
                }
            }
        });
    }

    @SuppressLint("RestrictedApi")
    public void onInfoEdit(View view) {
        boolean enable = (boolean) view.getTag();
        view.setTag(!enable);
        initDefault(!enable);
        User vUser = mBinding.getUser();
        Log.i(TAG, "onInfoEdit: " + vUser);
    }

    public void onInfoApply() {
        User vUser = mBinding.getUser();
        mViewModel.updateUserInfo(vUser, Const.Flag.INFO_UPDATE);
    }

    /**
     * 退出账号
     */
    public void onLoginOut() {
        PrefUtil.clearLoginInfo(getContext());
        App.sUser = null;
        startActivity(new Intent(getContext(), LoginActivity.class));
        getActivity().finish();
    }
}
