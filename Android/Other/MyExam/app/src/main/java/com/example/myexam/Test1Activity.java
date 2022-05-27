package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Test1Activity extends AppCompatActivity {
    TextView tvBirth, tvPassword, tvGender, tvAge;
    EditText edtBirth, edtPassWord, edtPwConfirm;
    Button btnConfirm,btnReset;
    RadioButton rbMan, rbWoman;
    CheckBox cbAgeCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        tvBirth = findViewById(R.id.tv_birth);
        tvPassword = findViewById(R.id.tv_password);
        tvAge = findViewById(R.id.tv_age);
        tvGender = findViewById(R.id.tv_gender);
        edtBirth = findViewById(R.id.edt_birth);
        edtPassWord = findViewById(R.id.edt_password);
        edtPwConfirm = findViewById(R.id.edt_pwconfirm);
        btnConfirm = findViewById(R.id.btn_confirm);
        btnReset = findViewById(R.id.btn_reset);
        rbMan = findViewById(R.id.rb_man);
        rbWoman = findViewById(R.id.rb_woman);
        cbAgeCal = findViewById(R.id.cb_agecal);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String birth = edtBirth.getText().toString();

                tvBirth.setText("생년월일: " + birth.substring(0,4) + "년 " + birth.substring(4,6) + "월 " + birth.substring(6,8) + "일");

                if(edtPassWord.getText().toString().equals(edtPwConfirm.getText().toString())){
                    tvPassword.setText(edtPassWord.getText().toString());
                }else{
                    Toast.makeText(getApplicationContext(),"비밀번호가 다릅니다" ,Toast.LENGTH_LONG).show();
                }

                if(rbMan.isChecked()){
                    tvGender.setText("성별: " + rbMan.getText().toString());
                }else if(rbWoman.isChecked()){
                    tvGender.setText("성별: " + rbWoman.getText().toString());
                }


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cbAgeCal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(cbAgeCal.isChecked()) {
                    int age = 2021 - Integer.parseInt(edtBirth.getText().toString().substring(0,4));

                    tvAge.setText("나이: " + Integer.toString(age) + "세");
                }
            }
        });

    }
}