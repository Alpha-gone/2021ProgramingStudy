package com.example.myapp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.myapp_5.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    Button btTimeACt, btVPTest;
    TextView tvReturnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        btTimeACt = findViewById(R.id.bt_timeAct);
        btVPTest = findViewById(R.id.bt_VPTest);

        tvReturnTime = findViewById(R.id.tv_ReturnTime);

        Intent ResultIntent = getIntent();

        btTimeACt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, TesttimerActivity.class);
                startActivity(mIntent);
            }
        });

        btVPTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, TestvpActivity.class);
                startActivity(mIntent);
            }
        });
        tvReturnTime.setText(ResultIntent.getStringExtra("Time"));
    }
}