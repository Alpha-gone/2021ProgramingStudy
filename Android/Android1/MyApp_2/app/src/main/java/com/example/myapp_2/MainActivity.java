package com.example.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edInput1, edInput2;
    Button btnP, btnM, btnMU, btnD;
    TextView tvResult;
    String sInput1, sInput2;
    int nResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edInput1 = findViewById(R.id.ed_Input1);
        edInput2 = findViewById(R.id.ed_Input2);
        btnP = findViewById(R.id.btn_P);
        btnM = findViewById(R.id.btn_M);
        btnMU = findViewById(R.id.btn_MU);
        btnD = findViewById(R.id.btn_D);
        tvResult = findViewById(R.id.tv_result);



        btnP.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                sInput1 = edInput1.getText().toString();
                sInput2 = edInput2.getText().toString();

                nResult = Integer.parseInt(sInput1) + Integer.parseInt(sInput2);

                tvResult.setText(Integer.toString(nResult));
                return false;
            }
        });

        btnM.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                sInput1 = edInput1.getText().toString();
                sInput2 = edInput2.getText().toString();

                nResult = Integer.parseInt(sInput1) - Integer.parseInt(sInput2);

                tvResult.setText(Integer.toString(nResult));
                return false;
            }
        });

        btnMU.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                sInput1 = edInput1.getText().toString();
                sInput2 = edInput2.getText().toString();

                nResult = Integer.parseInt(sInput1) * Integer.parseInt(sInput2);

                tvResult.setText(Integer.toString(nResult));
                return false;
            }
        });

        btnD.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                sInput1 = edInput1.getText().toString();
                sInput2 = edInput2.getText().toString();
                if(sInput2.equals("0")|| sInput2.isEmpty()){
                    tvResult.setText("계산 불가");
                }else{
                    nResult = Integer.parseInt(sInput1) / Integer.parseInt(sInput2);
                    tvResult.setText(Integer.toString(nResult));
                }

                return false;
            }
        });
    }
}