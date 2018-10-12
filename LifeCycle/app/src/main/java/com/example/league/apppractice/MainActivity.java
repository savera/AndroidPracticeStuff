package com.example.league.apppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("hi", "creating");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hi", "stopping");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hi ", "starting");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hi", "destroying");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hi", "pausing");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hi", "resuming");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hi", "restarting");
    }
}
