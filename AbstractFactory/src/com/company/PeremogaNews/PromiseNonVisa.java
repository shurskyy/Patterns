package com.company.PeremogaNews;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public class PromiseNonVisa implements Peremoga
{
    @Override
    public void promise()
    {
        int monthToVisa =(int)(Math.random()*11+1);
        System.out.println("Non visa will be in "+ monthToVisa + " month");
    }
}
