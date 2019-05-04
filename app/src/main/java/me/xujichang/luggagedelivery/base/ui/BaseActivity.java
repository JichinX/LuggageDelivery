package me.xujichang.luggagedelivery.base.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import me.xujichang.luggagedelivery.base.WrapperEntity;
import me.xujichang.luggagedelivery.entity.User;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.base.ui
 *
 * @author xujichang
 * @date 2019-04-25 - 23:06
 * <p>
 * modify:
 */
public class BaseActivity extends AppCompatActivity {


    protected void toActivity(Intent intent) {
        startActivity(intent);
    }

    protected void toActivity(Class<? extends Activity> clazz) {
        toActivity(new Intent(this, clazz));
    }

    protected void showToast(WrapperEntity<User> entity) {
        Toast.makeText(getContext(), entity.toErrorString(), Toast.LENGTH_SHORT).show();
    }

    private Context getContext() {
        return this;
    }

}
