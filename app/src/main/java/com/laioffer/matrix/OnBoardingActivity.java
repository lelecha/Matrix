package com.laioffer.matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class OnBoardingActivity extends AppCompatActivity {
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        // setup viewpager and tablayout
        viewpager = findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        OnBoardingPageAdapter onBoardingPageAdapter = new OnBoardingPageAdapter(getSupportFragmentManager());
        viewpager.setAdapter(onBoardingPageAdapter);

        tabLayout.setupWithViewPager(viewpager);
    }
}
