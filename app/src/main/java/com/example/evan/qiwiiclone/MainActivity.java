package com.example.evan.qiwiiclone;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayoutID);
        appBarLayout = findViewById(R.id.appBarID);
        viewPager = findViewById(R.id.viewPagerID);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());


        //adding fragments
        adapter.addFragment(new HomeActivity_fragment(),"HOME");
        adapter.addFragment(new AntrianActivity_fragment(),"ANTRIAN SAYA");
        adapter.addFragment(new PesanActivity_fragment(),"PESAN");
        adapter.addFragment(new ProfilActivity_fragment(),"PROFIL");
        //setting up adapter
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
