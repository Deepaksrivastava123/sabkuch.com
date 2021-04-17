package com.example.barcodescanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.barcodescanner.Fragments.HelpFragment;
import com.example.barcodescanner.Fragments.HomeFragment;
import com.example.barcodescanner.Fragments.KhatabookFragment;
import com.example.barcodescanner.Fragments.NewCustomerFragment;
import com.example.barcodescanner.Fragments.QrCodeScanFragment;

import com.example.barcodescanner.Fragments.SearchCustomerFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottom_navigation_Activity extends AppCompatActivity {

    BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();


        bnv=(BottomNavigationView)findViewById(R.id.bottomnavigation);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment temp = null;
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        temp = new HomeFragment();
                        break;
                    case R.id.nav_New_Customer:
                        temp = new NewCustomerFragment();
                        break;
                    case R.id.nav_Khatabook:
                        temp = new KhatabookFragment();
                        break;
                    case R.id.search_Customer:
                        temp = new SearchCustomerFragment();
                        break;
                    case R.id.nav_help:
                        temp = new HelpFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, temp).commit();
                return true;
            }
            });

        }

    }
