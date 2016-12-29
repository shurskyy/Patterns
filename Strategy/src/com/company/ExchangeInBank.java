package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public class ExchangeInBank implements CurrencyExchange
{

    @Override
    public float execute(int amount, float rate)
    {
        System.out.println("Exchange was executed in Bank");
        return amount*rate;
    }
}
