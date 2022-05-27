package com.example.retrofittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView tvResultFilter, tvResultMessage;
    EditText edtMessage;
    Button btnSend, btnSmartCampus;

    Retrofit retrofit;
    Post postMessage;
    PostResult result;
    String[] responseMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultFilter = findViewById(R.id.tvResultFilter);
        tvResultMessage = findViewById(R.id.tvResultMessage);
        edtMessage = findViewById(R.id.edtMessage);
        btnSend = findViewById(R.id.btnSend);
        btnSmartCampus = findViewById(R.id.btnSmartCampus);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://asia-northeast1-root-station-341716.cloudfunctions.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(service);
            }
        });

        /*edtMessage.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(i == KeyEvent.KEYCODE_ENTER){
                    sendMessage(service);
                }
                return true;
            }
        });*/

        btnSmartCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = getPackageManager().getLaunchIntentForPackage("kr.ac.dlu.atdc");
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }catch (Exception e){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(
                            "market://details?id=kr.ac.dlu.atdc"));
                    startActivity(intent);
                }
            }
        });

    }

    private void sendMessage(RetrofitService service){
        String message = edtMessage.getText().toString().trim();

        postMessage = new Post("0", message);

        Call<PostResult> call = service.setPostBody(postMessage);

        call.enqueue(new Callback<PostResult>() {
            @Override
            public void onResponse(Call<PostResult> call, Response<PostResult> response) {
                if(response.isSuccessful()){
                     result = response.body();
                    responseMessage = result.toString().split("//");
                    tvResultFilter.setText(responseMessage[0].trim());
                    tvResultMessage.setText(responseMessage[1].trim());
                }
            }

            @Override
            public void onFailure(Call<PostResult> call, Throwable t) {
                tvResultFilter.setText("서버 연결 오류");
                tvResultMessage.setText("서버 연결 오류");
            }
        });
    }

}