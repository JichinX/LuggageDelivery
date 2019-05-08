package me.xujichang.luggagedelivery.ui.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import me.xujichang.luggagedelivery.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController vController = Navigation.findNavController(this, R.id.fragment_main);
        NavigationUI.setupWithNavController(navView, vController);
    }
}
