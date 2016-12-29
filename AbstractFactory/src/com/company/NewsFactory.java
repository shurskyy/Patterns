package com.company;

import com.company.PeremogaNews.Peremoga;
import com.company.ZradaNews.Zrada;

/**
 * Created by Serhiy_Hurskyy on 12/29/2016.
 */
public abstract class NewsFactory
{
    abstract Zrada generateZrada(String zrada);
    abstract Peremoga generatePeremoga(String peremoga);
}
