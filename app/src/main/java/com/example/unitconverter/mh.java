package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mh extends AppCompatActivity {
    private Button buttonmh;
    private TextView textView;
    private EditText editText;
    private Button buttonhm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mh);
        buttonhm = findViewById(R.id.buttonhm);
        textView = findViewById(R.id.textView4);
        editText = findViewById(R.id.editTextNumberDecimal2);
        buttonhm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int h = Integer.parseInt(s);
                double m = 60 * h;
                textView.setText("Hour to Minutes is: "  + m);
            }
        });

        buttonmh = findViewById(R.id.buttonmh);
        textView = findViewById(R.id.textView4);
        editText = findViewById(R.id.editTextNumberDecimal2);
        buttonmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int m = Integer.parseInt(s);
                double h = m/60;
                textView.setText("Minutes to Hours is: "  + h);
            }
        });
    }
}