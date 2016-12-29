package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public class Context
{
    private CurrencyExchange currencyExchange;
    public Context(CurrencyExchange currencyExchange){
        this.currencyExchange=currencyExchange;
    }

    public float executeCurrencyExchange(int amount, float rate){
        return currencyExchange.execute(amount, rate);
    }

    private int getRandomAmount()
    {
        int randomAmount =(int) (Math.random() * 100 +1);
        System.out.println("The customer sold: " + randomAmount +" $");
        return randomAmount;
    }

    private float getRandomRate()
    {
        float randomRate =(float)(Math.random() * 3 +27);
        System.out.println("The exchange rate is: " + randomRate + " Grn/$");
        return randomRate;
    }

    public void executedExchange(Context context){
        System.out.println("The customer received: " +Math.round(context.executeCurrencyExchange(getRandomAmount(), getRandomRate())) + " Grn");
    }

}
