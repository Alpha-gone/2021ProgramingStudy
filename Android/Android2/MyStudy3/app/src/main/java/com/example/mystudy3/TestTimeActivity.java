package com.example.mystudy3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class TestTimeActivity extends AppCompatActivity {
    Button btnDateOk;
    TimePicker tpTime;
    EditText edtTIme;

    public void initFindId(){
        btnDateOk = findViewById(R.id.btn_dateOk);
        tpTime = findViewById(R.id.tp_time);
        edtTIme = findViewById(R.id.edt_time);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_time);

        initFindId();

        tpTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                //int nSelTime = tpTime.getCurrentHour();
                //int nSelMin = tpTime.getCurrentMinute();

                edtTIme.setText(Integer.toString(tpTime.getCurrentHour()) + " : " + Integer.toString(tpTime.getCurrentMinute()));
            }
        });

        btnDateOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int nSelTime = tpTime.getCurrentHour();
                //int nSelMin = tpTime.getCurrentMinute();

                edtTIme.setText(Integer.toString(tpTime.getCurrentHour()) + " : " + Integer.toString(tpTime.getCurrentMinute()));
            }
        });
    }
}