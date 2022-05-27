package com.example.myapp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TesttimerActivity extends AppCompatActivity {
    TimePicker tpTime;
    TextView tvTime;
    Button btTimeView, btGoMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testtimer);

        tpTime = findViewById(R.id.tp_Time);
        tvTime = findViewById(R.id.tv_Time);
        btTimeView = findViewById(R.id.bt_Time);
        btGoMain = findViewById(R.id.bt_main);

        tpTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                tvTime.setText("TIME = " + Integer.toString(hourOfDay)+ " : " + Integer.toString(minute));
            }
        });

        btTimeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTime.setText("TIME = " + Integer.toString(tpTime.getCurrentHour())+ " : " + Integer.toString(tpTime.getCurrentMinute()));
                // tvTime.setText(Integer.toString(tpTime.getHour())+ " : " + Integer.toString(tpTime.getMinute()));
            }
        });

        btGoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(TesttimerActivity.this, MainActivity.class);
                mIntent.putExtra("Time","TIME = " + Integer.toString(tpTime.getCurrentHour())+
                        " : " + Integer.toString(tpTime.getCurrentMinute()));
//                mIntent.putExtra("Time",tvTime.getText().toString());
                startActivity(mIntent);


            }
        });
    }
}