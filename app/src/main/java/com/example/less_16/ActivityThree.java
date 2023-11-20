package com.example.less_16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ActivityThree extends AppCompatActivity {
    TextView tW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Log.d("ActivityThreeCreate", "StateDebug");

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        tW = findViewById(R.id.textView2);
        tW.setText(sdf.format(Calendar.getInstance().getTime()));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityThreeStart", "StateDebug");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityThreeResume", "StateDebug");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityThreePause", "StateDebug");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityThreeRestart", "StateDebug");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityThreeStop", "StateDebug");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityThreeDestroy", "StateDebug");
    }
}