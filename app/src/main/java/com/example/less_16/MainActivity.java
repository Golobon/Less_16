package com.example.less_16;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.os.VibrationAttributes;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tV;
    final int ALPHA = 1;
    final int ROTATE = 2;
    final int SCALE = 3;
    final int TRANS = 4;
    final int COMBO = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV = findViewById(R.id.tV);
        registerForContextMenu(tV);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, ALPHA, 0, "Alpha");
        menu.add(0, ROTATE, 0, "Rotate");
        menu.add(0, SCALE, 0, "Scale");
        menu.add(0, TRANS, 0, "Trans");
        menu.add(0, COMBO, 0, "Combo");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int res = item.getItemId();
        Animation anim = null;
        if (res == ALPHA) anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        if (res == ROTATE) anim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        if (res == SCALE) anim = AnimationUtils.loadAnimation(this, R.anim.scale);
        if (res == TRANS) anim = AnimationUtils.loadAnimation(this, R.anim.trans);
        if (res == COMBO) anim = AnimationUtils.loadAnimation(this, R.anim.combo);
        tV.startAnimation(anim);
        return super.onContextItemSelected(item);
    }
}