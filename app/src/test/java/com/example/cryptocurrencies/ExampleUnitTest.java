package com.example.cryptocurrencies;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.cryptocurrencies.model.CoinDetails;
import com.example.cryptocurrencies.model.CoinList;
import com.example.cryptocurrencies.network.CoinListApi;
import com.example.cryptocurrencies.network.CoinListApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getCryptoCurrency() throws IOException {
        CoinListApiService service = new CoinListApi().createCoinListApiService();
        Call<List<CoinList>> call = service.fetchCoinsList();
        List<CoinList> cryptoCurrencies = call.execute().body();
        assertNotNull(cryptoCurrencies);
        assertFalse(cryptoCurrencies.isEmpty());
        System.out.println(new Gson().toJson(cryptoCurrencies));
    }

    @Test
    public void getCoinDetails() throws IOException {
      CoinListApiService service = new CoinListApi().createCoinListApiService();
      Call<CoinDetails> call = service.fetchCoinDetails();
      CoinDetails coinDetails = call.execute().body();
      assertNotNull(coinDetails);
      System.out.print(new Gson().toJson(coinDetails));
    }
}