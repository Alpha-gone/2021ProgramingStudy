package com.example.jsonparsingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView tvParsingTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvParsingTest = findViewById(R.id.tv_Test);

        try {
            tvParsingTest.setText(jsonParsing());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String jsonParsing() throws JSONException {
        StringBuffer sb = new StringBuffer();

        String jsonString =
                "{"
                        +   "\"posts\": ["
                        +       "{"
                        +           "\"title\": \"how to get stroage size\","
                        +           "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
                        +           "\"draft\": false"
                        +       "},"
                        +       "{"
                        +           "\"title\": \"Android Q, Scoped Storage\","
                        +           "\"url\": \"https://codechacha.com/ko/android-q-scoped-storage/\","
                        +           "\"draft\": false"
                        +       "},"
                        +       "{"
                        +           "\"title\": \"How to parse JSON in android\","
                        +           "\"url\": \"https://codechacha.com/ko/how-to-parse-json-in-android/\","
                        +           "\"draft\": true"
                        +       "}"
                        +   "]"
                        +"}";

        JSONObject jObject = new JSONObject(jsonString);
        JSONArray jArray = jObject.getJSONArray("posts");

        for(int i = 0; i < jArray.length(); i++){
            JSONObject obj = jArray.getJSONObject(i);
            String title = obj.getString("title");
            sb.append(title + "\n");
        }

        return sb.toString();
    }
}