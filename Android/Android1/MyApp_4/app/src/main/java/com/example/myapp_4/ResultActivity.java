package com.example.myapp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    Button btGoMain;
    TextView tvMainName, tvMainBirth;
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btGoMain = findViewById(R.id.bt_GoMain);
        tvMainName = findViewById(R.id.tv_mainName);
        tvMainBirth = findViewById(R.id.tv_mainBirth);
        ivImage = findViewById(R.id.iv_image);

        Intent MainIntent = getIntent();

        tvMainName.setText(MainIntent.getStringExtra("MyName"));
        tvMainBirth.setText(MainIntent.getStringExtra("MyBirth"));

        if(MainIntent.getBooleanExtra("isView", false)){
            ivImage.setVisibility(View.VISIBLE);
        }else{
            ivImage.setVisibility(View.GONE);
        }

        btGoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}