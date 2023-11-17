package com.example.less_16;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.os.VibrationAttributes;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MenuProvider {
    EditText eT1;
    EditText eT2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView tW;
    final int MENU_RESET = 1;
    final int MENU_EXIT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT1 = findViewById(R.id.editTextText);
        eT2 = findViewById(R.id.editTextText2);

        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(this);

        tW = findViewById(R.id.textView);
        tW.setTextSize(26);

        addMenuProvider(this);
    }

    @Override
    public void onClick(View v) {
        if (!eT1.getText().toString().equals("") && !eT2.getText().toString().equals("")) {
            float val1 = Float.parseFloat(eT1.getText().toString());
            float val2 = Float.parseFloat(eT2.getText().toString());
            if (v.equals(b1)) tW.setText(String.valueOf(val1 + val2));
            if (v.equals(b2)) tW.setText(String.valueOf(val1 - val2));
            if (v.equals(b3)) tW.setText(String.valueOf(val1 * val2));
            if (v.equals(b4)) {
                if (val2 != 0) tW.setText(String.valueOf(val1 / val2));
                else Toast.makeText(this, "На ноль делить нельзя", Toast.LENGTH_LONG).show();
            }
        } else Toast.makeText(this, "Не заполнены все поля", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        menu.add(0, MENU_RESET, 0, "Reset");
        menu.add(0, MENU_EXIT, 0, "Exit");
    }

    @Override
    public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
        int res = menuItem.getItemId();
        switch (res) {
            case MENU_RESET : eT1.setText(""); eT2.setText(""); tW.setText(""); break;
            case MENU_EXIT : finish(); break;
        }
        return true;
    }
}