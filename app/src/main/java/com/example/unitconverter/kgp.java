package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kgp extends AppCompatActivity {
 private Button buttonkg;
private TextView textView;
private EditText editText;
private Button buttonpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kgp);
  buttonkg = findViewById(R.id.button5);
textView = findViewById(R.id.textView3);
editText = findViewById(R.id.editTextNumberDecimal);
buttonkg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textView.setText("KG to Pound is: "  + pound);
    }
});

        buttonpd = findViewById(R.id.button6);
        textView = findViewById(R.id.textView3);
        editText = findViewById(R.id.editTextNumberDecimal);
        buttonpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int lb = Integer.parseInt(s);
                double kg = lb/2.205;
                textView.setText("Pound to KG is: "  + kg);
            }
        });
    }
}