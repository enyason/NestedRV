package com.nexdev.enyason.nestedrv.Api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by enyason on 10/9/18.
 */

public class RetrofitSingleton {

    private String BASE_URL = "http://unjoyful-box.000webhostapp.com/test/";

    private Retrofit retrofit;
    OkHttpClient.Builder okHttpClient;


    private static RetrofitSingleton retrofitSingletonInstance;
    private Gson gson;

    private RetrofitSingleton() {

        gson = new GsonBuilder()
                .setLenient()
                .create();

        okHttpClient = new OkHttpClient.Builder();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();


    }


    public static synchronized RetrofitSingleton getInstance() {

        if (retrofitSingletonInstance == null) {
            retrofitSingletonInstance = new RetrofitSingleton();
        }

        return retrofitSingletonInstance;


    }

    public RetrofitApiClient getApi() {

        return retrofit.create(RetrofitApiClient.class);

    }



}
