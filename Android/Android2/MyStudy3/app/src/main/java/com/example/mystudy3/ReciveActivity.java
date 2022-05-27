package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ReciveActivity extends AppCompatActivity {
    EditText edtReciveName, edtReciveMoney;
    RadioButton rbReciveRoll, rbReciveFlash;
    TextView tvScreenWidth, tvScreenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive);

        Intent mInent = getIntent();
        edtReciveName = findViewById(R.id.edt_reciveName);
        edtReciveMoney = findViewById(R.id.edt_reciveMoney);
        rbReciveRoll = findViewById(R.id.rb_reciveRoll);
        rbReciveFlash = findViewById(R.id.rb_reciveFlash);
        tvScreenWidth = findViewById(R.id.tv_screenWidth);
        tvScreenHeight = findViewById(R.id.tv_screenHeight);

        edtReciveName.setText(mInent.getStringExtra("Name"));
        edtReciveMoney.setText(Integer.toString(mInent.getIntExtra("GameMoney", 0)));
        if(mInent.getIntExtra("Game", 0) == 1){
            rbReciveRoll.setChecked(true);
        }else if(mInent.getIntExtra("Game", 0) == 2){
            rbReciveFlash.setChecked(true);
        }

        tvScreenWidth.setText("가로 해상도 : " + Integer.toString(mInent.getIntExtra("WidthDisplay", 0)));
        tvScreenHeight.setText("세로 해상도 : " + Integer.toString(mInent.getIntExtra("HeightDisplay", 0)));
    }
}