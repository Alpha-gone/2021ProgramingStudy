package com.example.project_1st;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlPullParserException;


public class MainActivity extends AppCompatActivity {
    TextView tvResult, tvCounting, tvXml;
    ImageButton ibtnRecod;
    Intent intent;
    SpeechRecognizer mRecognizer;
    final int PERMISSION = 1;
    boolean bToggle = true;

    XmlPullParser xpp;
    String sOC = "990131";
    String sData, sId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if ( Build.VERSION.SDK_INT >= 23 ){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET,
                    Manifest.permission.RECORD_AUDIO},PERMISSION);
        }

        tvResult = findViewById(R.id.tv_result);
        tvCounting = findViewById(R.id.tv_counting);
        ibtnRecod = findViewById(R.id.ibtn_recode);

        tvXml = findViewById(R.id.tv_Xml);


        intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,getPackageName());
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ko-KR");



        ibtnRecod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bToggle){
                    ibtnRecod.setImageResource(R.drawable.mike_after);
                    mRecognizer = SpeechRecognizer.createSpeechRecognizer(MainActivity.this);
                    mRecognizer.setRecognitionListener(listener);
                    mRecognizer.startListening(intent);
                    bToggle = false;
                }else{
                    ibtnRecod.setImageResource(R.drawable.mike_before);
                    mRecognizer.stopListening();
                    bToggle = true;
                }

            }
        });
    }

    private RecognitionListener listener = new RecognitionListener() {
        @Override
        public void onReadyForSpeech(Bundle bundle) {
            Toast.makeText(getApplicationContext(), "?????? ?????? ", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onBeginningOfSpeech() {
            Toast.makeText(getApplicationContext(), "?????? ????????? ???????????????. ", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onRmsChanged(float v) {

        }

        @Override
        public void onBufferReceived(byte[] bytes) {

        }

        @Override
        public void onEndOfSpeech() {
            Toast.makeText(getApplicationContext(), "?????? ????????? ???????????????. ", Toast.LENGTH_SHORT).show();
            ibtnRecod.setImageResource(R.drawable.mike_before);
            mRecognizer.stopListening();
            bToggle = true;
        }

        @Override
        public void onError(int error) {
            String Message;

            switch (error){
                case SpeechRecognizer.ERROR_AUDIO:
                        Message = "????????? ??????";
                        break;
                case SpeechRecognizer.ERROR_CLIENT:
                    Message = "??????????????? ??????";
                    break;
                case SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS:
                    Message = "????????? ??????" ;
                    break;
                case SpeechRecognizer.ERROR_NETWORK:
                    Message = "???????????? ??????";
                    break;
                case SpeechRecognizer.ERROR_NETWORK_TIMEOUT:
                    Message = "???????????? ????????????";
                    break;
                case SpeechRecognizer.ERROR_NO_MATCH:
                    Message = "?????? ??? ??????";
                    break;
                case SpeechRecognizer.ERROR_RECOGNIZER_BUSY:
                    Message = "RECOGNIZER??? ??????";
                    break;
                case SpeechRecognizer.ERROR_SERVER:
                    Message = "?????? ??????";
                    break;
                case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
                    Message = "?????? ?????? ??????";
                    break;
                default:
                    Message = "??? ??? ?????? ??????";
                    break;
            }
            Toast.makeText(getApplicationContext(), "????????? ?????? ??????????????? : " + Message, Toast.LENGTH_SHORT).show();
            ibtnRecod.setImageResource(R.drawable.mike_before);
            bToggle = true;
        }

        @Override
        public void onResults(Bundle result) {
            ArrayList<String> mathces = result.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
            StringBuffer sBuffer = new StringBuffer();
            String[] arString = {"??????", "???", "???", "???"};
            String sResult;
            int nCount;

            for(int i = 0; i < mathces.size(); i++){
                tvResult.setText(mathces.get(i));
            }

            tvResult.setText("?????? ?????? ????????? ???????????? ???????????????");
            sResult = tvResult.getText().toString();

            for(int i = 0; i < arString.length; i++){
                nCount = StringUtils.countMatches(sResult, arString[i]);
                if(nCount != 0){
                    sBuffer.append(arString[i] + ": " + Integer.toString(nCount) + "???\n");
                }
            }

            tvCounting.setText(sBuffer.toString());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    sData = getXmldata("https://www.law.go.kr/DRF/lawSearch.do?OC=" + sOC + "&target=prec&type=XML&query=??????");

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tvXml.setText(sData);
                        }
                    });
                }
            }).start();

        }

        @Override
        public void onPartialResults(Bundle bundle) {

        }

        @Override
        public void onEvent(int i, Bundle bundle) {

        }
    };

    String getXmldata(String queryUrl){
        StringBuffer sBuffer = new StringBuffer();

        try{
            URL url = new URL(queryUrl);
            InputStream is = url.openStream();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8"));

            String tag;

            xpp.next();
            int eventType = xpp.getEventType();
            while(eventType != XmlPullParser.END_DOCUMENT){
                switch(eventType){
                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();

                        if(tag.equals("??????????????????")){
                            xpp.next();
                            sBuffer.append(getXmldata("https://www.law.go.kr/DRF/lawService.do?OC=" + sOC + "&target=prec&type=XML&ID=", xpp.getText()));
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        tag = xpp.getName();
                        
                        break;
                }
                eventType = xpp.next();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return  sBuffer.toString();
    }

    String getXmldata(String Url, String sId){
        StringBuffer sBuffer = new StringBuffer();
        String sMain;

        String queryUrl = Url + sId;
        try{
            URL url = new URL(queryUrl);
            InputStream is = url.openStream();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8"));

            String tag;

            xpp.next();
            int eventType = xpp.getEventType();
            while(eventType != XmlPullParser.END_DOCUMENT){
                switch(eventType){
                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();

                        if(tag.equals("?????????")){
                            sBuffer.append("????????? : ");
                            xpp.next();
                            sBuffer.append(xpp.getText());
                            sBuffer.append("\n");
                        } else if(tag.equals("????????????")){
                            sBuffer.append("???????????? : ");
                            xpp.next();
                            sBuffer.append(xpp.getText());
                            sBuffer.append("\n");
                        }else if(tag.equals("??????")){
                            sBuffer.append("?????? : ");
                            xpp.next();
                            sBuffer.append(xpp.getText());
                            sBuffer.append("\n");
                        }else if(tag.equals("????????????")){
                            sBuffer.append("?????? : ");
                            xpp.next();
                            sMain = xpp.getText();
                            sBuffer.append(sMain.substring(sMain.indexOf("??????") + 2, sMain.indexOf("??????")).replace("<br/>", "").trim());
                            sBuffer.append("\n");
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        tag = xpp.getName();

                        if(tag.equals("PrecService")){
                            sBuffer.append("\n");
                        }
                        break;
                }
                eventType = xpp.next();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return  sBuffer.toString();
    }
}