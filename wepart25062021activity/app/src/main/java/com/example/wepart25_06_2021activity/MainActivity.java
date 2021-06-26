package com.example.wepart25_06_2021activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private static final String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"on Craete");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"On Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"On Restart");
    }

}