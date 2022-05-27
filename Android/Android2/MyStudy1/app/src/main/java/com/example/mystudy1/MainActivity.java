package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnWidgetTest1, btnWidgetTest2, btnWidgetTest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWidgetTest1 = findViewById(R.id.btn_WidgetTest1);
        btnWidgetTest2 = findViewById(R.id.btn_WidgetTest2);
        btnWidgetTest3 = findViewById(R.id.btn_WidgetTest3);

        btnWidgetTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WTest1Activity.class);
                startActivity(myIntent);
            }
        });

        btnWidgetTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WTest2Activity.class);
                startActivity(myIntent);
            }
        });

        btnWidgetTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WTest3Activity.class);
                startActivity(myIntent);
            }
        });
    }
}