package com.example.mytest3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSubActivity1, btnSubActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubActivity1 = findViewById(R.id.btn_GoBack);
        btnSubActivity2 = findViewById(R.id.btn_SubActivity2);

        btnSubActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Test One", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this, SubActivity1.class);
                startActivity(myIntent);
            }
        });

        btnSubActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SubActivity2.class);
                startActivity(myIntent);
            }
        });
    }
}