package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class km extends AppCompatActivity {
    private Button buttonkm;
    private TextView textView;
    private EditText editText;
    private Button buttonmk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km);
        buttonkm = findViewById(R.id.button);
        textView = findViewById(R.id.textView5);
        editText = findViewById(R.id.editTextNumberDecimal3);
        buttonkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int km = Integer.parseInt(s);
                double mil = 0.621 * km;
                textView.setText("KM to Miles is: "  + mil);
            }
        });

        buttonmk = findViewById(R.id.button8);
        textView = findViewById(R.id.textView5);
        editText = findViewById(R.id.editTextNumberDecimal3);
        buttonmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int m = Integer.parseInt(s);
                double km = m * 1.609;
                textView.setText("Miles to KM is: "  + km);
            }
        });
    }
}
