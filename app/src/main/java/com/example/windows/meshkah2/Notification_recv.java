package com.example.windows.meshkah2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.app.NotificationCompat;

/**
 * Created by WinDows on 09/05/18.
 */

class Notification_recv extends BroadcastReceiver{


    @Override
    public void onReceive(Context context, Intent intent) {


        NotificationManager notificationManager=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        //Intent intent1=new Intent(context,MainActivity.class);

       // PendingIntent pendingIntent=PendingIntent.getActivity(context,100,intent1,PendingIntent.FLAG_UPDATE_CURRENT);

        android.support.v4.app.NotificationCompat.Builder builder=new android.support.v4.app.NotificationCompat.Builder(context);//.setContentTitle("هاي بيبي").setContentText("hi").setAutoCancel(true);
        notificationManager.notify(1,builder.build());

    }
}
