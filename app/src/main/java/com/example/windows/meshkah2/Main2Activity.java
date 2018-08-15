package com.example.windows.meshkah2;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        myadapter=new SlideAdapter(this);
        viewPager.setAdapter(myadapter);
        viewPager.setCurrentItem(myadapter.getCount()-1);
    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        Intent intent =new Intent(Main2Activity.this , MainActivity.class);
        startActivity(intent);
    }
}
