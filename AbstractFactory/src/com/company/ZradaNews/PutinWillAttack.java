package com.company.ZradaNews;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public class PutinWillAttack implements Zrada
{
    @Override
    public void accuse()
    {
        int daysToAttack =(int)(Math.random()*6+1);
        System.out.println("Putin will attack in " + daysToAttack +" days");
    }
}
