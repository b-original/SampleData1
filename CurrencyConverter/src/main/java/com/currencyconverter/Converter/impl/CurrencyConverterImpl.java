package com.currencyconverter.Converter.impl;

import com.currencyconverter.Converter.Currencyconverter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverterImpl implements Currencyconverter {

    @Override
    public float callConverter(String to,String from, float amt) throws IOException, InterruptedException {

        var url="https://api.apilayer.com/exchangerates_data/convert?to="+to+"&from="+from+"&amount="+amt;
        HttpRequest request= HttpRequest.newBuilder().GET().uri(URI.create(url)).header("apikey","E0aNhLvYHxMpho9Le95wIBsutgFBi7Y9").build();
        var httpClient= HttpClient.newBuilder().build();
        var response = httpClient.send( request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        return 0;
    }

    @Override
    public String ListCurrencies() throws IOException, InterruptedException {
        var url="https://api.apilayer.com/exchangerates_data/symbols";
        HttpRequest request= HttpRequest.newBuilder().GET().uri(URI.create(url)).header("apikey","E0aNhLvYHxMpho9Le95wIBsutgFBi7Y9").build();
        var httpClient= HttpClient.newBuilder().build();
        var response = httpClient.send( request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        if(response.statusCode()==200) {
            return response.body();
        }
        else{
            return "No data";
        }
    }


}
