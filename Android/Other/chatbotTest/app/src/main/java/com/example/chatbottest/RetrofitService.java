package com.example.chatbottest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitService {
    @POST("function-1/")
    Call<PostResult> setPostBody(@Body Post post);
}
