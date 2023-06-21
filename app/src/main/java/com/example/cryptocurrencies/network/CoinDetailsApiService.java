package com.example.cryptocurrencies.network;

import com.example.cryptocurrencies.model.CoinDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinDetailsApiService {

    @GET("btc-bitcoin")
    Call<CoinDetails> fetchCoinDetails();
}
