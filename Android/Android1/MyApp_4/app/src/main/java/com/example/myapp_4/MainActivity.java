package com.example.myapp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btSub1, btSub2, btSub3, btRsult;
    EditText edName, edBirth;
    CheckBox cbImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSub1 = findViewById(R.id.bt_sub_1);
        btSub2 = findViewById(R.id.bt_sub_2);
        btSub3 = findViewById(R.id.bt_sub_3);
        btRsult = findViewById(R.id.bt_result);
        edName = findViewById(R.id.ed_myName);
        edBirth = findViewById(R.id.ed_myBirthDay);
        cbImage = findViewById(R.id.cb_viewImage);

        btRsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, ResultActivity.class);
                mIntent.putExtra("MyName", edName.getText().toString());
                mIntent.putExtra("MyBirth",edBirth.getText().toString());
                mIntent.putExtra("isView", cbImage.isChecked());
                startActivity(mIntent);
            }
        });

        btSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, Sub1Activity.class);
                startActivity(mIntent);
            }
        });

        btSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, Sub2Activity.class);
                startActivity(mIntent);
            }
        });

        btSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, Sub3Activity.class);
                startActivity(mIntent);
            }
        });
    }
}
