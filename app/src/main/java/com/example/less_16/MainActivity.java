package com.example.less_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b2;
    Button b1;
    Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivityCreate", "StateDebug");
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.but1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.but2);
        b2.setOnClickListener(this);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivityStart", "StateDebug");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivityResume", "StateDebug");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivityPause", "StateDebug");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivityRestart", "StateDebug");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivityStop", "StateDebug");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivityDestroy", "StateDebug");
    }
    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.equals(b1)) {
            intent = new Intent("ru.golobon.intent.action.showtime");
        } else if (v.equals(b2)) {
            intent = new Intent("ru.golobon.intent.action.showdate");
        }
        startActivity(intent);
    }
}