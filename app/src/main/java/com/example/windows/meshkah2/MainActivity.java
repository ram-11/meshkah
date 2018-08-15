package com.example.windows.meshkah2;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Calendar;

import static java.util.Calendar.*;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGraid;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();

        calendar.set(HOUR_OF_DAY, 20);
        calendar.set(MINUTE, 27);
        calendar.set(SECOND, 0);


        mainGraid = (GridLayout) findViewById(R.id.mainGraid);

        setSigleEvent(mainGraid);

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void startAlarm(Calendar c) {

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, Notification_recv.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 1, intent, 0);
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), pendingIntent);
    }

    private void setSigleEvent(GridLayout mainGraid) {

        CardView cardView2 = (CardView) mainGraid.getChildAt(0);
        CardView cardView3 = (CardView) mainGraid.getChildAt(1);
        CardView cardView4 = (CardView) mainGraid.getChildAt(2);
        CardView cardView5 = (CardView) mainGraid.getChildAt(3);
        CardView cardView6 = (CardView) mainGraid.getChildAt(4);
        CardView cardView7 = (CardView) mainGraid.getChildAt(5);

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);


            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);


            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);


            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent);


            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);


            }
        });


        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(intent);


            }
        });

    }


    final String TAG = this.getClass().getName();
    boolean t;

    @Override
  /*  public void onBackPressed() {

        Log.d(TAG,"click");
        if(t==true){
            super.onBackPressed();

        }


        Toast.makeText(MainActivity.this,"اضغط مرة اخرى للخروج ",Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                t=false;
            }
        },3000);
        t=true;


    }
}
*/ public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("الخروج من مشكاة")
                .setMessage("هل تريد الخروج من التطبيق؟")
                .setNegativeButton("لا", null)
                .setPositiveButton("نعم", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        //MainActivity.super.onBackPressed();
                        finish();
                    }
                }).create().show();
    }
}