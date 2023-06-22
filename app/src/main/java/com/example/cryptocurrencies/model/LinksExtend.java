package com.example.cryptocurrencies.model;

import com.google.gson.annotations.SerializedName;

public class LinksExtend {
    private String url;
    private String type;
    @SerializedName("stats")
    private Stat stats;
}
