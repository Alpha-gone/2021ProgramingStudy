package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileRWTestActivity extends AppCompatActivity {
    EditText edtWUserId, edtWUserPassWord;
    TextView tvRUserId, tvRUserPassWord;
    Button btnWrite, btnRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_rwtest);

        edtWUserId = findViewById(R.id.edt_Wuserid);
        edtWUserPassWord = findViewById(R.id.edt_Wuserpassword);
        btnWrite = findViewById(R.id.btn_write);
        tvRUserId = findViewById(R.id.tv_Ruserid);
        tvRUserPassWord = findViewById(R.id.tv_Ruserpassword);
        btnRead = findViewById(R.id.btn_read);

        tvRUserId.setVisibility(View.GONE);
        tvRUserPassWord.setVisibility(View.GONE);

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sWUserId = edtWUserId.getText().toString().trim();
                String sWUserPassWord = edtWUserPassWord.getText().toString().trim();

//                Toast.makeText(getApplicationContext(), sWUserId, Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(),sWUserId, Toast.LENGTH_SHORT).show();

                try{
                    FileOutputStream FoMyFile = openFileOutput("UserFile.txt", Context.MODE_PRIVATE);

                    sWUserId = myTenChar(sWUserId);
                    sWUserPassWord = myTenChar(sWUserPassWord);

                    FoMyFile.write(sWUserId.getBytes(), 0, sWUserId.length());
                    FoMyFile.write(sWUserPassWord.getBytes(), 0, sWUserPassWord.length());

                    FoMyFile.close();


                    Toast.makeText(getApplicationContext(), "UserFIle.txt 생성", Toast.LENGTH_SHORT).show();
                    btnRead.setVisibility(View.VISIBLE);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileInputStream FiMyFile = openFileInput("UserFile.txt");
                    byte[] baUserId = new byte[10];
                    byte[] baUserPassWord = new byte[10];

                    FiMyFile.read(baUserId);
                    FiMyFile.read(baUserPassWord);

                    String sRUserId = new String(baUserId);
                    String sRUserPassWor = new String(baUserPassWord);

                    tvRUserId.setVisibility(View.VISIBLE);
                    tvRUserPassWord.setVisibility(View.VISIBLE);

                    tvRUserId.setText(sRUserId.trim());
                    tvRUserPassWord.setText(sRUserPassWor.trim());

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