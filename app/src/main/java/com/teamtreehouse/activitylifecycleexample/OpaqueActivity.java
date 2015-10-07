package com.teamtreehouse.activitylifecycleexample;

import android.os.Bundle;

public class OpaqueActivity extends LoggingActivity {

    public OpaqueActivity() {
        setActivityName("OpaqueActivity");}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opaque);
    }

}