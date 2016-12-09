package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/8/2016.
 */
public class SsEmployee implements Employee
{
    @Override
    public String getDocuments()
    {
        SsAccountant mariyana = new SsAccountant();
        return mariyana.getDocuments();
    }
}
