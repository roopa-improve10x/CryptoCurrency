package com.example.cryptocurrencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cryptocurrencies.databinding.ActivityCoinListBinding;

public class CoinListActivity extends AppCompatActivity {

    ActivityCoinListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCoinListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}