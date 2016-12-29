package com.company;

import com.company.PeremogaNews.Peremoga;
import com.company.PeremogaNews.PromiseNonVisa;
import com.company.PeremogaNews.PromiseProtectionByTheLaw;
import com.company.ZradaNews.Zrada;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public class PeremogaNewsFactory extends NewsFactory
{
    @Override
    Zrada generateZrada(String zrada)
    {
        return null;
    }

    @Override
    Peremoga generatePeremoga(String peremoga)
    {
        if (peremoga.isEmpty())
        {
            return null;
        }
        if (peremoga.equalsIgnoreCase("Visa"))
        {
            return new PromiseNonVisa();
        }
        if (peremoga.equalsIgnoreCase("Improvement")){
            return new PromiseProtectionByTheLaw();
        }
        return null;
    }
}
