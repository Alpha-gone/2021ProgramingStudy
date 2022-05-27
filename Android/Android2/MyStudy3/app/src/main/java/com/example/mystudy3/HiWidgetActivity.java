package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HiWidgetActivity extends AppCompatActivity {
    Button btnTestTime, btnTestSv, btnTestSDraw;

    public void InitFindId(){
        btnTestTime = findViewById(R.id.btn_testTime);
        btnTestSv = findViewById(R.id.btn_testSv);
        btnTestSDraw = findViewById(R.id.btn_testSDraw);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi_widget);

        InitFindId();


    }

    public void onTestTimeClick(View view) {
        Intent myIntent = new Intent(HiWidgetActivity.this, TestTimeActivity.class);
        startActivity(myIntent);
    }

    public void onTestSvClick(View view) {
        Intent myIntent = new Intent(HiWidgetActivity.this, TestScrollViewActivity.class);
        startActivity(myIntent);
    }

    public void onTestSlidingDrawClick(View view) {
        Intent myIntent = new Intent(HiWidgetActivity.this, TestSdrawActivity.class);
        startActivity(myIntent);
    }

    public void onTestFlipperClick(View view) {
        Intent myIntent = new Intent(HiWidgetActivity.this, TestFlipperActivity.class);
        startActivity(myIntent);
    }
}