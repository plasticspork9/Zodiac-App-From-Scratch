package com.example.zodiacappfromscratch.network;

import com.example.zodiacappfromscratch.model.Zodiac;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ZodiacService {
    @GET("JDVila/storybook/master/zodiac.json")
    Call<Zodiac> getZodiac();
}
