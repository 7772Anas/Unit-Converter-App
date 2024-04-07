package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cmInches extends AppCompatActivity {
    private Button buttoncmi;
    private TextView textView;
    private EditText editText;
    private Button buttonicm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_inches);
        buttoncmi = findViewById(R.id.cmi);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextNumber);
        buttoncmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int cm = Integer.parseInt(s);
                double Inches = 0.3937 * cm;
                textView.setText("CM to Inches is: "  + Inches);
            }
        });

        buttonicm = findViewById(R.id.button7);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextNumber);
        buttonicm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int Inches = Integer.parseInt(s);
                double CM = 2.54 * Inches;
                textView.setText("Inches to CM is: "  + CM);
            }
        });
    }
}