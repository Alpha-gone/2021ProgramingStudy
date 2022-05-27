package com.example.chatbottest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvChats;
    Button btnSend, btnSmartCampus;
    EditText edtMessage;
    Switch swDark;

    final String USER_KEY = "user";
    final String BOT_KEY = "bot";
    String themeColor;

    ArrayList<MessageModal> messageModalArrayList;
    MessageRVAdapter messageRVAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvChats = findViewById(R.id.rvChats);
        btnSend = findViewById(R.id.btnSend);
        edtMessage = findViewById(R.id.edtMessage);

        btnSmartCampus = findViewById(R.id.btnSamrtCampus);
        swDark = findViewById(R.id.swDark);

        messageModalArrayList = new ArrayList<>();

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userMessage = edtMessage.getText().toString();
                if(userMessage.isEmpty()){
                    Toast.makeText(getApplicationContext(), "질문을 입력하세요", Toast.LENGTH_LONG).show();
                    return;
                }

                sendMessage(userMessage.trim());

                edtMessage.setText("");
            }
        });

        btnSmartCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = getPackageManager().getLaunchIntentForPackage("kr.ac.dlu.atdc");
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                catch (Exception e){
                    String url = "market://details?id=kr.ac.dlu.atdc";
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(i);
                }
            }
        });

        swDark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swDark.isChecked()){
                    themeColor = ThemeUtil.DARK_MODE;
                    ThemeUtil.applyTheme(themeColor);
                    ThemeUtil.modSave(getApplicationContext(), themeColor);
                }else{
                    themeColor = ThemeUtil.LIGHT_MODE;
                    ThemeUtil.applyTheme(themeColor);
                    ThemeUtil.modSave(getApplicationContext(), themeColor);
                }
            }
        });

        messageRVAdapter = new MessageRVAdapter(messageModalArrayList, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false);
        rvChats.setLayoutManager(linearLayoutManager);
        rvChats.setAdapter(messageRVAdapter);
    }

    private void sendMessage(String userMessage) {
        messageModalArrayList.add(new MessageModal(userMessage, USER_KEY));
        messageRVAdapter.notifyDataSetChanged();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://asia-northeast1-root-station-341716.cloudfunctions.net/")
                //.baseUrl("api server url")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        Post postMessage = new Post("1", userMessage);

        Call<PostResult> call = service.setPostBody(postMessage);

        call.enqueue(new Callback<PostResult>() {
            @Override
            public void onResponse(Call<PostResult> call, Response<PostResult> response) {
                if(response.isSuccessful()){
                    PostResult result = response.body();
                    //String responseMessage = result.toString().replace("isFilter:1 // ", "");
                    String responseMessage = result.getAnswer().replace("isFilter:1 // ", "");
                    messageModalArrayList.add(new MessageModal(responseMessage, BOT_KEY));
                    messageRVAdapter.notifyDataSetChanged();
                    rvChats.smoothScrollToPosition(messageModalArrayList.size());
                }
            }

            @Override
            public void onFailure(Call<PostResult> call, Throwable t) {
                messageModalArrayList.add(new MessageModal("서버 연결에 오류가 생겼습니다.", BOT_KEY));
                messageRVAdapter.notifyDataSetChanged();
                rvChats.smoothScrollToPosition(messageModalArrayList.size());
            }
        });


    }
}