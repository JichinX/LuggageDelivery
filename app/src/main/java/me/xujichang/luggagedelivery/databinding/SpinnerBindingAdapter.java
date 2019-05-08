package me.xujichang.luggagedelivery.databinding;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.databinding
 *
 * @author xujichang
 * @date 2019-05-08 - 00:52
 * <p>
 * modify:
 */
public class SpinnerBindingAdapter {
    /**
     * @param spinner
     * @param flag    0 女 1 男 -1 其他
     */
    @BindingAdapter("selectData")
    public static void loadSelection(Spinner spinner, int flag) {
        spinner.setSelection(flag);
    }

    @InverseBindingAdapter(attribute = "selectData", event = "selectionChange")
    public static int getSelection(Spinner pSpinner) {
        return pSpinner.getSelectedItemPosition();
    }

    @BindingAdapter(value = "selectionChange")
    public static void bindSelection(Spinner pSpinner, InverseBindingListener pListener) {
        pSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pListener.onChange();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @BindingAdapter("selectDept")
    public static void selectDept(Spinner pSpinner, long index) {

    }

    @InverseBindingAdapter(attribute = "selectDept", event = "deptChange")
    public static long setDept(Spinner pSpinner) {
        return 1L;
    }

    @BindingAdapter("deptChange")
    public static void bindDept(Spinner pSpinner, InverseBindingListener pListener) {
        pSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pListener.onChange();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
