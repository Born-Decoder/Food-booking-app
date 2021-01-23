package com.example.edible;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.p005ui.AppBarConfiguration;
import androidx.navigation.p005ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0563R.layout.activity_main);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(C0563R.C0565id.navigation_home, C0563R.C0565id.navigation_dashboard, C0563R.C0565id.navigation_notifications, C0563R.C0565id.navigation_account).build();
        NavController navController = Navigation.findNavController(this, C0563R.C0565id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController((AppCompatActivity) this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController((BottomNavigationView) findViewById(C0563R.C0565id.nav_view), navController);
    }
}
