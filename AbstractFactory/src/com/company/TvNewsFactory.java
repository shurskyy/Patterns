package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public class TvNewsFactory
{
    public static NewsFactory getFactory(String factory)
    {
        if (factory.equalsIgnoreCase("Zrada"))
        {
            return new ZradaNewsFactory();

        }
        else if (factory.equalsIgnoreCase("Peremoga"))
        {
            return new PeremogaNewsFactory();
        }
        return null;
    }
}
