package com.teamtreehouse.activitylifecycleexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LoggingActivity extends AppCompatActivity {

    private String mFilterTag = "LifecycleExample";
    private String mActivityName = "";

    protected void setActivityName(String activityName) {
        mActivityName = activityName;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(mFilterTag, mActivityName + " onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(mFilterTag, mActivityName + " onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(mFilterTag, mActivityName + " onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(mFilterTag, mActivityName + " onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(mFilterTag, mActivityName + " onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(mFilterTag, mActivityName + " onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(mFilterTag, mActivityName + " onDestroy");
        super.onDestroy();
    }
}
