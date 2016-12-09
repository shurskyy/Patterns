package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/8/2016.
 */
public class EpamEployee implements Employee
{
    @Override
    public String getDocuments()
    {
        SsEmployee dima = new SsEmployee();
        return dima.getDocuments();
    }
}
