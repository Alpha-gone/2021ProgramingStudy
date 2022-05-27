package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnDrawTest, btnIntentTest, btnFileRWTest, btnHiWidget, btnWebTest, btnTouchTest;

    private void initFindXml(){
        btnDrawTest = findViewById(R.id.btn_drawTest);
        btnIntentTest = findViewById(R.id.btn_intentTest);
        btnFileRWTest = findViewById(R.id.btn_filerwTest);
        btnHiWidget = findViewById(R.id.btn_hiWidget);
        btnWebTest = findViewById(R.id.btn_webTest);
        btnTouchTest = findViewById(R.id.btn_touchTest);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFindXml();


        btnDrawTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, DrawTestActivity.class);
                startActivity(myIntent);
            }
        });

        btnIntentTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, IntentTestActivity.class);
                startActivity(myIntent);
            }
        });

        btnFileRWTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, FileRWTestActivity.class);
                startActivity(myIntent);
            }
        });

        btnHiWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, HiWidgetActivity.class);
                startActivity(myIntent);
            }
        });

        btnWebTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, WebTestActivity.class);
                startActivity(myIntent);
            }
        });

        btnTouchTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, TouchTestActivity.class);
                startActivity(myIntent);
            }
        });
    }
}