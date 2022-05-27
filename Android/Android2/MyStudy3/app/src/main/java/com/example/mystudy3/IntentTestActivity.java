package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class IntentTestActivity extends AppCompatActivity {
    EditText edtName, edtGameMoney;
    RadioButton rbRoll, rbFlash;
    Button btnSend;
    TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_test);

        btnSend = findViewById(R.id.btn_send);
        rbRoll = findViewById(R.id.rb_roll);
        rbFlash = findViewById(R.id.rb_flash);
        edtName = findViewById(R.id.edt_name);
        edtGameMoney = findViewById(R.id.edt_gamemoney);
        tvTest = findViewById(R.id.tv_test);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisplayMetrics displayMetrics = new DisplayMetrics(); // 해상도 구하기 시작
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int nDeviceWidth = displayMetrics.widthPixels;
                int nDeviceHeight = displayMetrics.heightPixels; // 종료

                String sName = edtName.getText().toString();
                String sGameMoney = edtGameMoney.getText().toString();
                int nMoney = Integer.parseInt(sGameMoney);
                int nGame = 0;

                if(rbRoll.isChecked()){
                    nGame = 1;
                }else if(rbFlash.isChecked()){
                    nGame = 2;
                }

                tvTest.setText(sName + ',' + Integer.toString(nMoney) + ',' + Integer.toString(nGame));

                Intent myIntent = new Intent(IntentTestActivity.this, ReciveActivity.class);

                myIntent.putExtra("Name", sName);
                myIntent.putExtra("GameMoney", nMoney);
                myIntent.putExtra("Game", nGame);
                myIntent.putExtra("WidthDisplay", nDeviceWidth);
                myIntent.putExtra("HeightDisplay", nDeviceHeight);
                startActivity(myIntent);
            }
        });
    }


}