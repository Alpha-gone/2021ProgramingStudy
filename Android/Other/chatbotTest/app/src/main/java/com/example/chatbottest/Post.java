package com.example.chatbottest;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("isFilter")
    private String isFilter;

    @SerializedName("message")
    private String message;

    public Post(String isFilter, String message){
        this.isFilter = isFilter;
        this.message = message;
    }
}
