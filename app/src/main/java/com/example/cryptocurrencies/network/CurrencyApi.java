package com.example.cryptocurrencies.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyApi {
    public CurrencyApiService createCurrencyApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinpaprika.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CurrencyApiService service = retrofit.create(CurrencyApiService.class);
        return service;
    }
}
