package com.operation.restapiwidthmvvm.data;

import com.operation.restapiwidthmvvm.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface PostInterface {
    @GET("posts")
    public Call<List<PostModel>> getPosts();
}