package com.example.cryptocurrencies.network;

import com.example.cryptocurrencies.model.CoinDetails;
import com.example.cryptocurrencies.model.CoinList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinListApiService {

    @GET("/v1/coins")
    Call<List<CoinList>> fetchCoinsList();

    @GET("/v1/coins/btc-bitcoin")
    Call<CoinDetails> fetchCoinDetails();
}
