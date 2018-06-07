package com.example.hyeon.mobile_programming_class;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NotificationView extends AppCompatActivity {
    int notificationID = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_view);
    }
    public void onClick(View view) {
        displayNotification();
    }
    @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    protected void displayNotification()
    {
        //---PendingIntent to launch activity if the user selects
        // this notification---
        Intent i = new Intent(this, NotificationView.class);
        i.putExtra("notificationID", notificationID);
        PendingIntent pendingIntent =
                PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_ONE_SHOT);
        NotificationManager nm = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        Notification.Builder mBuilder =
                new Notification.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("My notification")
                        .setContentText("Reminder: Meeting starts in 5 minutes");
        mBuilder.setContentIntent(pendingIntent);
        //---100ms delay, vibrate for 250ms, pause for 100 ms and
        // then vibrate for 500ms---
        mBuilder.setVibrate(new long[] { 100, 250, 100, 500});
        nm.notify(notificationID, mBuilder.build());
    }
}
