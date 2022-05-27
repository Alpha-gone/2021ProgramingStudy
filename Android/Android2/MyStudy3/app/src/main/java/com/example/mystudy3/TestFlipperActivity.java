package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestFlipperActivity extends AppCompatActivity {
    Button btnPrev, btnNext, btnFlipperOk, btnFlipperLogin;
    EditText edtUserNameOk, edtUserIdOk, edtUserPwdOk, edtUserIdLogin, edtUserPwdLogin;
    ViewFlipper myFlipper;

    public void initFindId(){
        btnPrev = findViewById(R.id.btn_prev);
        btnNext = findViewById(R.id.btn_next);
        btnFlipperOk = findViewById(R.id.btn_FlipperOk);
        btnFlipperLogin = findViewById(R.id.btn_FlipperLogin);
        myFlipper = findViewById(R.id.vf_myFlipper);

        edtUserNameOk  = findViewById(R.id.edt_FlipperUserName);
        edtUserIdOk = findViewById(R.id.edt_FlipperUserId);
        edtUserPwdOk = findViewById(R.id.edt_FlipperUserPassword);
        edtUserIdLogin = findViewById(R.id.edt_LoginUserId);
        edtUserPwdLogin = findViewById(R.id.edt_LoginUserPwd);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_flipper);

        initFindId();


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myFlipper.showPrevious();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myFlipper.showNext();
            }
        });

        btnFlipperOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sWUserName = edtUserNameOk.getText().toString().trim();
                String sWUserId = edtUserIdOk.getText().toString().trim();
                String sWUserPassWord = edtUserPwdOk.getText().toString().trim();

//                Toast.makeText(getApplicationContext(), sWUserId, Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(),sWUserId, Toast.LENGTH_SHORT).show();

                try{
                    FileOutputStream FoMyFile = openFileOutput("FlipperUserFile.txt", Context.MODE_PRIVATE);

                    sWUserName = myTenChar((sWUserName));
                    sWUserId = myTenChar(sWUserId);
                    sWUserPassWord = myTenChar(sWUserPassWord);

                    FoMyFile.write(sWUserName.getBytes(), 0, sWUserName.length());
                    FoMyFile.write(sWUserId.getBytes(), 0, sWUserId.length());
                    FoMyFile.write(sWUserPassWord.getBytes(), 0, sWUserPassWord.length());

                    FoMyFile.close();


                    Toast.makeText(getApplicationContext(), "FlipperUserFile.txt 생성", Toast.LENGTH_SHORT).show();

                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        btnFlipperLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileInputStream FiMyFile = openFileInput("FlipperUserFile.txt");
                    byte[] baUserName = new byte[10];
                    byte[] baUserId = new byte[10];
                    byte[] baUserPassWord = new byte[10];

                    FiMyFile.read(baUserName);
                    FiMyFile.read(baUserId);
                    FiMyFile.read(baUserPassWord);

                    String sRUserName = new String(baUserName).trim();
                    String sRUserId = new String(baUserId).trim();
                    String sRUserPassWord = new String(baUserPassWord).trim();

                    /*sRUserName = sRUserName.trim();
                    sRUserId = sRUserId.trim();
                    sRUserPassWord = sRUserPassWord.trim();*/

                    if(sRUserId.equals(edtUserIdLogin.getText().toString().trim()) && sRUserPassWord.equals(edtUserPwdLogin.getText().toString().trim())) {
                        Toast.makeText(getApplicationContext(), sRUserName + "님 환영합니다.", Toast.LENGTH_SHORT).show();
                    }else if(!sRUserId.equals(edtUserIdLogin.getText().toString().trim())){
                        Toast.makeText(getApplicationContext(), "Id가 다릅니다", Toast.LENGTH_SHORT).show();
                    }else if(!sRUserPassWord.equals(edtUserPwdLogin.getText().toString().trim())){
                        Toast.makeText(getApplicationContext(), "비밀번호가 다릅니다", Toast.LENGTH_SHORT).show();
                    }else  if(!sRUserId.equals(edtUserIdLogin.getText().toString().trim()) && !sRUserPassWord.equals(edtUserPwdLogin.getText().toString().trim())) {
                        Toast.makeText(getApplicationContext(), "ID, 비밀번호 모두 다릅니다.", Toast.LENGTH_SHORT).show();
                    }


                    FiMyFile.close();

                }catch (IOException e){
                    Toast.makeText(getApplicationContext(), "파일 없음", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public String myTenChar(String sTarget){
        String sTemp = sTarget;

        for(int i = 0; i <= (10 - sTarget.length()); i++){
            sTemp += " ";
        }

        return sTemp;
    }
}