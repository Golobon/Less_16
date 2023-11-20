package com.example.less_16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ActivityTwo extends AppCompatActivity {
    TextView tW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d("ActivityTwoCreate", "StateDebug");

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        tW = findViewById(R.id.textView1);
        tW.setText(sdf.format(Calendar.getInstance().getTime()));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityTwoStart", "StateDebug");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityTwoResume", "StateDebug");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityTwoPause", "StateDebug");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityTwoRestart", "StateDebug");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityTwoStop", "StateDebug");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityTwoDestroy", "StateDebug");
    }
}