package com.example.mystudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvUserS, tvUserR, tvUserP, tvComS, tvComR, tvComP, tvResult;
    CheckBox cbUserS, cbUserR, cbUserP;
    Button btnRCP, btnOneMin;
    int userL, userR, userF, comL, comR, comF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUserS = findViewById(R.id.tv_users);
        tvUserR = findViewById(R.id.tv_userr);
        tvUserP = findViewById(R.id.tv_userp);
        tvComS = findViewById(R.id.tv_coms);
        tvComR = findViewById(R.id.tv_comr);
        tvComP = findViewById(R.id.tv_comp);
        tvResult = findViewById(R.id.tv_result);
        cbUserS = findViewById(R.id.cb_users);
        cbUserR = findViewById(R.id.cb_userr);
        cbUserP = findViewById(R.id.cb_userp);
        btnRCP = findViewById(R.id.btn_rsp);
        btnOneMin = findViewById(R.id.btn_onemin);

        tvComS.setVisibility(View.INVISIBLE);
        tvComR.setVisibility(View.INVISIBLE);
        tvComP.setVisibility(View.INVISIBLE);

        btnRCP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int check = 0;

                if(cbUserS.isChecked()){
                    check++;
                }
                if(cbUserR.isChecked()){
                    check++;
                }
                if(cbUserP.isChecked()){
                    check++;
                }

                userL = 0;
                userR = 0;
                if(check !=2){
                    Toast.makeText(getApplicationContext(),"두개만 선택",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cbUserS.isChecked()){
                    tvUserS.setVisibility(View.VISIBLE);
                    if(userR == 0) {
                        userR = 1;
                    }else{
                        userL = 1;
                    }
                }else{
                    tvUserS.setVisibility(View.INVISIBLE);
                }

                if(cbUserR.isChecked()){
                    tvUserR.setVisibility(View.VISIBLE);
                    if(userR == 0) {
                        userR = 1;
                    }else{
                        userL = 1;
                    }
                }else{
                    tvUserR.setVisibility(View.INVISIBLE);
                }

                if(cbUserP.isChecked()){
                    tvUserP.setVisibility(View.VISIBLE);
                    if(userR == 0) {
                        userR = 1;
                    }else{
                        userL = 1;
                    }
                }else{
                    tvUserP.setVisibility(View.INVISIBLE);
                }

                tvComS.setVisibility(View.INVISIBLE);
                tvComR.setVisibility(View.INVISIBLE);
                tvComP.setVisibility(View.INVISIBLE);

                comL = (int)(Math.random() * 3) + 1;
                do {
                    comR = (int) (Math.random() * 3) + 1;
                }while(comL == comR);

                if(comL == 1){
                    tvComS.setVisibility(View.VISIBLE);
                }else if (comL == 2){
                    tvComR.setVisibility(View.VISIBLE);
                }else if (comL == 3){
                    tvComP.setVisibility(View.VISIBLE);
                }

                if(comR == 1){
                    tvComS.setVisibility(View.VISIBLE);
                }else if (comR == 2){
                    tvComR.setVisibility(View.VISIBLE);
                }else if (comR == 3){
                    tvComP.setVisibility(View.VISIBLE);
                }

            }
        });

        btnOneMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int check = 0;

                if(cbUserS.isChecked()){
                    check++;
                }
                if(cbUserR.isChecked()){
                    check++;
                }
                if(cbUserP.isChecked()){
                    check++;
                }

                userL = 0;
                userR = 0;
                if(check !=1){
                    Toast.makeText(getApplicationContext(),"한개만 선택",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(cbUserS.isChecked()){
                    tvUserS.setVisibility(View.VISIBLE);
                    userF = 1;
                }else{
                    tvUserS.setVisibility(View.INVISIBLE);
                }

                if(cbUserR.isChecked()){
                    tvUserR.setVisibility(View.VISIBLE);
                    userF = 1;
                }else{
                    tvUserR.setVisibility(View.INVISIBLE);
                }

                if(cbUserP.isChecked()){
                    tvUserP.setVisibility(View.VISIBLE);
                    userF = 1;
                }else{
                    tvUserP.setVisibility(View.INVISIBLE);
                }

                int temp = (int)(Math.random() * 2) + 1;
                if(temp == 1){
                    comF = comL;
                }else{
                    comF = comL;
                }

                tvComS.setVisibility(View.INVISIBLE);
                tvComR.setVisibility(View.INVISIBLE);
                tvComP.setVisibility(View.INVISIBLE);

                if(comF == 1){
                    tvComS.setVisibility(View.VISIBLE);
                }else if (comF == 2){
                    tvComR.setVisibility(View.VISIBLE);
                }else if (comF == 3){
                    tvComP.setVisibility(View.VISIBLE);
                }

                String[][] sResult = {{"비겼습니다.", "졌습니다.", "이겼습니다."},
                        {"이겼습니다.", "비겼습니다.", "졌습니다."},
                        {"졌습니다.", "이겼습니다.", "비겼습니다."}};

                tvResult.setText("게임결과: " + sResult[userF][comF]);
            }
        });


    }
}