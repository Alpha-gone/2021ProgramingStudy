package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebTestActivity extends AppCompatActivity {
    Button btnGo, btnBack;
    WebView wvWeb;
    EditText edtUrl;

    private void initFindXml(){
        btnGo = findViewById(R.id.btn_go);
        btnBack = findViewById(R.id.btn_back);
        wvWeb = findViewById(R.id.webv_web);
        edtUrl = findViewById(R.id.edt_url);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_test);

        initFindXml();

        wvWeb.setWebViewClient(new MyWebViewClient());
        WebSettings webSet = wvWeb.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wvWeb.loadUrl(edtUrl.getText().toString().trim());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wvWeb.goBack();
            }
        });
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}