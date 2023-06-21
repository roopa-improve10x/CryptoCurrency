package com.example.cryptocurrencies.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Links implements Serializable {
    private ArrayList<String> explorer;
    private ArrayList<String> facebook;
    private ArrayList<String> reddit;
    @SerializedName("source_code")
    private ArrayList<String> sourceCode;
    private ArrayList<String> website;
    private ArrayList<String> youtube;
}
