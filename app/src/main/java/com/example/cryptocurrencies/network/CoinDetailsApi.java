package com.example.cryptocurrencies.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CoinDetailsApi {

    public CoinDetailsApiService createCoinDetailsApiService() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinpaprika.com/v1/coins/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CoinDetailsApiService service = retrofit.create(CoinDetailsApiService.class);
        return service;
    }
}
