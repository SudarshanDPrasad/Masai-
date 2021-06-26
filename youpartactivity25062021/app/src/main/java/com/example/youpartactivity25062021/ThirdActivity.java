package com.example.youpartactivity25062021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private static final String TAG = "Third Activity";
    private Button mThirdbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mThirdbutton=findViewById(R.id.ThirdButton);
        mThirdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this,"success",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

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