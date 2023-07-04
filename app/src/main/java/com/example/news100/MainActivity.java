package com.example.news100;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.news100.Adapters.Adapterone;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

   TabLayout tabLayout;
    ViewPager viewpager;

    String api = "abe79a4cdb114df39a365d88403c659c";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.viewpager01);
        tabLayout = findViewById(R.id.tablayout01);

        Adapterone adapterone = new Adapterone(getSupportFragmentManager());

        viewpager.setAdapter(adapterone);
        tabLayout.setupWithViewPager(viewpager);

    }
}