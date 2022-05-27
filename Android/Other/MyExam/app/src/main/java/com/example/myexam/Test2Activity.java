package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Test2Activity extends AppCompatActivity {
    TextView tvBank, tvPhone, tvNote, tvMethod, tvTotal;
    EditText edtPhone, edtNote;
    CheckBox cbPhone, cbNote, cbCalcul;
    RadioButton rbCard, rbCash, rbBank;
    Button btnConfirm, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        tvBank = findViewById(R.id.tv_bank);
        tvPhone = findViewById(R.id.tv_phone);
        tvNote = findViewById(R.id.tv_note);
        tvMethod = findViewById(R.id.tv_method);
        tvTotal = findViewById(R.id.tv_total);
        edtPhone = findViewById(R.id.edt_phone);
        edtNote = findViewById(R.id.edt_note);
        cbPhone = findViewById(R.id.cb_phone);
        cbNote = findViewById(R.id.cb_note);
        cbCalcul = findViewById(R.id.cb_calcul);
        rbCard = findViewById(R.id.rb_card);
        rbCash = findViewById(R.id.rb_cash);
        rbBank = findViewById(R.id.rb_bank);
        btnConfirm = findViewById(R.id.btn_T2confirm);
        btnReset = findViewById(R.id.btn_T2reset);

        tvBank.setVisibility(View.GONE);

        rbBank.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rbBank.isChecked()){
                    tvBank.setVisibility(View.VISIBLE);
                }
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbPhone.isChecked()){
                    tvPhone.setText("핸드폰 : " + edtPhone.getText().toString() + "개");
                }else{
                    tvPhone.setText("");
                }
                if(cbNote.isChecked()){
                    tvNote.setText("노트북 : " + edtNote.getText().toString() + "개");
                }else{
                    tvPhone.setText("");
                }

            }
        });

    }
}