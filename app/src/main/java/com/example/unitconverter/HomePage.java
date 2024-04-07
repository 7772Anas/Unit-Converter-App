package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class HomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void openActivity1(View V) {

        Intent intent = new Intent(this, kgp.class);
        startActivities(new Intent[]{intent});
    }

    public void openActivity2(View V) {

        Intent intent = new Intent(this, cmInches.class);
        startActivities(new Intent[]{intent});
    }

    public void openActivity3(View V) {

        Intent intent = new Intent(this, mh.class);
        startActivities(new Intent[]{intent});
    }

    public void openActivity4(View V) {

        Intent intent = new Intent(this, km.class);
        startActivities(new Intent[]{intent});
    }
}
