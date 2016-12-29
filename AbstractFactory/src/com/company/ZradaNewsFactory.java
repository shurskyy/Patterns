package com.company;

import com.company.PeremogaNews.Peremoga;
import com.company.ZradaNews.FindScapegoat;
import com.company.ZradaNews.PutinWillAttack;
import com.company.ZradaNews.Zrada;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public class ZradaNewsFactory extends NewsFactory
{

    @Override
    Zrada generateZrada(String zrada)
    {
        if (zrada.isEmpty())
        {
            return null;
        }
        if (zrada.equalsIgnoreCase("PutinWillAttack"))
        {
            return new PutinWillAttack();
        }
        if (zrada.equalsIgnoreCase("FindScapegoat")){
            return new FindScapegoat();
        }
        return null;
    }

    @Override
    Peremoga generatePeremoga(String peremoga)
    {
        return null;
    }
}
