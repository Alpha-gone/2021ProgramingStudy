package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class WTest2Activity extends AppCompatActivity {
    EditText edTest, edCheck, edNum1, edNum2;
    Button btnTest, btnCalcul;
    TextView tvTest, tvResult;
    RadioButton rbMinus, rbMulti, rbDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest2);

        edTest = findViewById(R.id.edt_test);
        edCheck = findViewById(R.id.edt_check);
        btnTest = findViewById(R.id.btn_Test);
        tvTest = findViewById(R.id.tv_Test);

        edNum1 = findViewById(R.id.edt_num1);
        edNum2 = findViewById(R.id.edt_num2);
        btnCalcul = findViewById(R.id.btn_cal);
        tvResult = findViewById(R.id.tv_result);
        rbMinus = findViewById(R.id.rb_minus);
        rbMulti = findViewById(R.id.rb_multi);
        rbDiv = findViewById(R.id.rb_div);

        edTest.setText(tvTest.getText().toString());

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTest.setText(edTest.getText().toString());

                if(edTest.getText().toString().equals(edCheck.getText().toString())){
                    Toast.makeText(getApplicationContext(),"값이 같습니다.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"값이 다릅니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });

        rbMinus.setChecked(true);

        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nNum1, nNum2;

                nNum1 = Integer.parseInt(edNum1.getText().toString());
                nNum2 = Integer.parseInt(edNum2.getText().toString());

                if(rbMinus.isChecked()){
                    tvResult.setText(Integer.toString(nNum1 - nNum2));
                }else if(rbMulti.isChecked()){
                    tvResult.setText(Integer.toString(nNum1 * nNum2));
                }else if(rbDiv.isChecked()){
                    tvResult.setText(Integer.toString(nNum1 / nNum2));
                }else{
                    tvResult.setText(Integer.toString(nNum1 + nNum2));
                }

            }
        });
    }
}