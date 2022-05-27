package com.example.retrofittest;

import com.google.gson.annotations.SerializedName;

public class PostResult {
    @SerializedName("answer")
    private String answer;

    @Override
    public String toString() {
        return answer;
    }
}
