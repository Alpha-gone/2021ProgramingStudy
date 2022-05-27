package com.example.chatbottest;

import com.google.gson.annotations.SerializedName;

public class PostResult {
    @SerializedName("answer")
    private String answer;

    @Override
    public String toString() {
        return answer;
    }

    public String getAnswer(){
        return  answer;
    }
}
