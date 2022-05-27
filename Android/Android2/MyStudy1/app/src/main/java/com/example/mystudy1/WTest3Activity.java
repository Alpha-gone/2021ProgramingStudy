package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class WTest3Activity extends AppCompatActivity {
    ImageView imgvS ,imgvR, imgvP;
    CheckBox chbS, chbR, chbP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest3);

        imgvS = findViewById(R.id.imgv_s);
        imgvR = findViewById(R.id.imgv_r);
        imgvP = findViewById(R.id.imgv_p);
        chbS = findViewById(R.id.chb_s);
        chbR = findViewById(R.id.chb_r);
        chbP = findViewById(R.id.chb_p);

        chbS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chbS.isChecked()){
                    imgvS.setVisibility(View.VISIBLE);
                }else{
                    imgvS.setVisibility(View.GONE);
                }
            }
        });

        chbR.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chbR.isChecked()){
                    imgvR.setVisibility(View.VISIBLE);
                }else{
                    imgvR.setVisibility(View.INVISIBLE);
                }
            }
        });

        chbP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chbP.isChecked()){
                    imgvP.setVisibility(View.VISIBLE);
                }else{
                    imgvP.setVisibility(View.INVISIBLE);
                }
            }
        });


    }

}