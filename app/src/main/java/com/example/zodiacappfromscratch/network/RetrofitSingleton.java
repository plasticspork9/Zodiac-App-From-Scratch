package com.example.zodiacappfromscratch.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {
    public static final String BASE_URL = "https://raw.githubusercontent.com/";
    private static Retrofit retrofit = null;

    private RetrofitSingleton() {

    }

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
