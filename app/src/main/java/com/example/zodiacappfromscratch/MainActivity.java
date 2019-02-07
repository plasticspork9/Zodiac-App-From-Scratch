package com.example.zodiacappfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.zodiacappfromscratch.model.Zodiac;
import com.example.zodiacappfromscratch.network.RetrofitSingleton;
import com.example.zodiacappfromscratch.network.ZodiacService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView recyclerView = findViewById(R.id.zodiac_recyclerview);

        Retrofit retrofit = RetrofitSingleton.getRetrofit();
        ZodiacService service = retrofit.create(ZodiacService.class);

        Call<Zodiac> call = service.getZodiac();
        call.enqueue(new Callback<Zodiac>() {
            @Override
            public void onResponse(Call<Zodiac> call, Response<Zodiac> response) {
                Log.d("samer", response.body().getZodiac().get(0).getName());
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

            }

            @Override
            public void onFailure(Call<Zodiac> call, Throwable t) {

            }
        });


    }
}
