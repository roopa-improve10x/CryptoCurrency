package com.example.cryptocurrencies.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Tag implements Serializable {
    private String id;
    private String name;
    @SerializedName("coin_counter")
    private Integer coinCounter;
    @SerializedName("ico_counter")
    private Integer icoCounter;
}
