package com.example.myapp_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btOk, btCancel;
    TextView tvResult;
    EditText edTitile;
    CheckBox chBeer, chWine;
    RadioButton rbMan, rbWoman, rbY, rbN, rbG;
    Switch swDoor;
    ImageView imgvBeer;
    String sString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOk = findViewById(R.id.btn_ok);
        btCancel = findViewById(R.id.btn_cancel);
        tvResult = findViewById(R.id.tv_result);
        edTitile = findViewById(R.id.eT_title);
        chBeer = findViewById(R.id.cb_beer);
        chWine = findViewById(R.id.cb_wine);
        rbMan = findViewById(R.id.rB_man);
        rbWoman = findViewById(R.id.rB_woman);
        rbY = findViewById(R.id.rB_y);
        rbN = findViewById(R.id.rB_n);
        rbG= findViewById(R.id.rB_give);
        swDoor = findViewById(R.id.sw_door);
        imgvBeer = findViewById(R.id.imgV_beer);

        chBeer.setChecked(true);
        imgvBeer.setVisibility(View.VISIBLE);
        
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sString = edTitile.getText().toString();
                
                tvResult.setText(sString);
            }
        });

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
                edTitile.setText("");
            }
        });

        chBeer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chBeer.isChecked()){
                    imgvBeer.setVisibility(View.VISIBLE);
                }else{
                    imgvBeer.setVisibility(View.INVISIBLE);
                }
            }
        });

        imgvBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbMan.isChecked()) {
                    Toast.makeText(getApplicationContext(), rbMan.getText() + " check", Toast.LENGTH_SHORT).show();
                }else if(rbWoman.isChecked()){
                    Toast.makeText(getApplicationContext(), rbWoman.getText() + " check", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}