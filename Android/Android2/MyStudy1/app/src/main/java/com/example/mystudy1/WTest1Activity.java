package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WTest1Activity extends AppCompatActivity {
    TextView tvNotUse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest1);

        tvNotUse = findViewById(R.id.tv_NotUse);

    }
}