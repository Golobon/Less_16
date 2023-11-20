package com.example.less_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Three extends AppCompatActivity {
        TextView tW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three2);

        Intent intent = getIntent();
        String action = intent.getAction();
        String format = "", texInfo = "";

        if (action.equals("ru.golobon.intent.action.showtime")){
            format = "HH:mm:ss";
            texInfo = "Time: ";
        }
        else if (action.equals("ru.golobon.intent.action.showdate")){
            format = "dd:MM:yyy";
            texInfo = "date: ";
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.ENGLISH);
        tW = findViewById(R.id.textView3);
        String dateTime = sdf.format(Calendar.getInstance().getTime());
        tW.setText(texInfo + dateTime);
    }
}