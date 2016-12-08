package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/8/2016.
 */
public class Serhiy implements EmployeeI
{
    @Override
    public String getDocuments()
    {
        Dima dima = new Dima();
        return dima.getDocuments();
    }
}
