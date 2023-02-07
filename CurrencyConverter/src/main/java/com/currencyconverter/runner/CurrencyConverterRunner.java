package com.currencyconverter.runner;

import com.currencyconverter.Converter.Currencyconverter;
import com.currencyconverter.Converter.impl.CurrencyConverterImpl;
import com.currencyconverter.countires.CountriesList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.currencyconverter.countires.CountriesList.*;

public class CurrencyConverterRunner {

    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);

        System.out.println("List of available currencies to enter:");
        List<String> currencyList= new ArrayList<>();
        currencyList.add(UAE_Dirham+" code: AED");
        currencyList.add(Australian_Dollar+" code: AUD");
        currencyList.add(Bangladeshi_Taka+" code: BDT");
        currencyList.add(Canadian_Dollar+" code: CAD");
        currencyList.add(Chinese_Yuan+" code: CNY");
        currencyList.add(Euro+" code: EUR");
        currencyList.add(Hong_Kong_Dollar+" code: HKD");
        currencyList.add(Japanese_Yen+" code: JPY");
        currencyList.add(Nepalese_Rupee+" code: NPR");
        currencyList.add(New_Zealand_Dollar+" code: NZD");
        currencyList.add(Pakistani_Rupee+" code: PKR");
        currencyList.add(Russian_Ruble+" code: RUB");
        currencyList.add(United_States_Dollar+" code: USD");
        currencyList.add(Indian_Rupee+" code: INR");
        currencyList.forEach(System.out::println );


        System.out.println("Enter the value from Which you want to convert :");
        String  fromCurr=scn.nextLine();


        System.out.println("Enter the value to Which you want to convert :");
        String  toCurr=scn.nextLine();

        System.out.println("Enter the value you want to convert :");
        float  amt=scn.nextFloat();
        Currencyconverter converter= new CurrencyConverterImpl();
        try {
            converter.callConverter(toCurr,fromCurr,amt);
            //System.out.println(converter.ListCurrencies());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
