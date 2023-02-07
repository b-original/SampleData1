package com.currencyconverter.Converter;

import java.io.IOException;

public interface Currencyconverter {

    float callConverter(String to,String from, float amt) throws IOException, InterruptedException;

    String ListCurrencies() throws IOException, InterruptedException;
}
