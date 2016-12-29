package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public class ExchangeInChangePoint implements CurrencyExchange
{
    @Override
    public float execute(int amount, float rate)
    {
        System.out.println("Exchange was executed in ChangePoint");
        return amount*rate;
    }
}

