package com.example.windows.meshkah2;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter2 myadapter;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
      //  viewPager=(ViewPager)findViewById(R.id.viewpager2);
       // myadapter=new SlideAdapter2(this);
      //  viewPager.setAdapter(myadapter);
      //  viewPager.setCurrentItem(myadapter.getCount()-1);


        final Button btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn1.setText("0");

            }
        });
        final Button btn2=(Button)findViewById(R.id.button2);
        String s=btn2.getText().toString();
        final int s2=Integer.parseInt(s.toString());
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(s2==0){
                    btn2.setText("0");
                }else{int r=s2-1;
                    btn2.setText(r);
                }
            }
        });

        final Button btn3=(Button)findViewById(R.id.button3);
        String ss=btn2.getText().toString();
        final int s3=Integer.parseInt(s.toString());
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(s3==0){
                    btn3.setText("0");
                }else{int r=s2-1;
                    btn3.setText(r);
                }
            }
        });
    }




    }
