package com.example.hyeon.mobile_programming_class;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class logcat extends AppCompatActivity {
    String tag = "LifeCycle";
    /**Called when the activity is first created */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcat);
        //Log.d(tag, "In the onCreate() event");
        Button btnStart = findViewById(R.id.btnStartService);
        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(new Intent(getApplicationContext(), MyService.class));
            }
        });
        Button btnStop = findViewById(R.id.btnStopService);
        btnStop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                stopService(new Intent(getApplicationContext(), MyService.class));
            }
        });
    }
    /*public void onStart() {
        super.onStart();
        Log.d(tag, "In the onStart() event");
    }

    public void onRestart() {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }

    public void onResume() {
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }

    public void onPause() {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }
    public void onStop() {
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }*/


}
