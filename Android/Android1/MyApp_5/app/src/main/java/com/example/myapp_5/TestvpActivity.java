package com.example.myapp_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class TestvpActivity extends AppCompatActivity {
    Button btLeft, btRight;
    ViewFlipper vpMyVP;
    CalendarView cvMyCal;
    TextView tvCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testvp);

        btLeft = findViewById(R.id.bt_left);
        btRight = findViewById(R.id.bt_right);
        vpMyVP = findViewById(R.id.vp_myVP);
        cvMyCal = findViewById(R.id.cv_myCaln);
        tvCal = findViewById(R.id.tv_tvCal);

        btLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMyVP.showPrevious();
            }
        });

        btRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMyVP.showNext();
            }
        });
        cvMyCal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                tvCal.setText(Integer.toString(year) + "."
                        + Integer.toString(month + 1) + "."
                        + Integer.toString(dayOfMonth));
            }
        });
    }
}