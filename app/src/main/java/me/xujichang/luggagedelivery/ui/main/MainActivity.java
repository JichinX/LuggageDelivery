package me.xujichang.luggagedelivery.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import me.xujichang.luggagedelivery.R;
import me.xujichang.luggagedelivery.base.ui.BaseFragment;
import me.xujichang.luggagedelivery.ui.main.fragments.CommentFragment;
import me.xujichang.luggagedelivery.ui.main.fragments.LogisticsFragment;
import me.xujichang.luggagedelivery.ui.main.fragments.OrderFragment;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private MainViewModel mViewModel;
    private BottomNavigationView mNavView;
    private FrameLayout mFragmentContainer;
    private ConstraintLayout mContainer;

    private BaseFragment orderFragment, commentFragment, logisticsFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_order:
                    showFragment(orderFragment);
                    return true;
                case R.id.navigation_logistics:
                    showFragment(logisticsFragment);
                    return true;
                case R.id.navigation_comment:
                    showFragment(commentFragment);
                    return true;
                default:
                    return false;
            }
        }
    };
    private Fragment currentFragment;
    private FragmentManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (null == savedInstanceState) {
            initFragments();
        }
        initView();
        initData();
    }

    private void initData() {
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
    }

    private void initFragments() {
        mManager = getSupportFragmentManager();
        currentFragment = new Fragment();
        orderFragment = OrderFragment.newInstance();
        commentFragment = CommentFragment.newInstance();
        logisticsFragment = LogisticsFragment.newInstance();
    }

    private void initView() {
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mFragmentContainer = findViewById(R.id.fragment_container);
        mContainer = findViewById(R.id.container);
        navView.setSelectedItemId(R.id.navigation_order);
    }

    private void showFragment(Fragment eFragment) {
        Log.i(TAG, "will showFragment: " + eFragment);

        if (eFragment != currentFragment) {
            FragmentTransaction transaction = mManager.beginTransaction();
            transaction.hide(currentFragment);
            Log.i(TAG, "hideFragment: " + currentFragment);
            currentFragment = eFragment;
            if (!eFragment.isAdded()) {
                transaction.add(R.id.fragment_container, eFragment).show(eFragment).commit();
                Log.i(TAG, "showFragment: " + eFragment);
            } else {
                transaction.show(eFragment).commit();
            }
        }
    }

}
