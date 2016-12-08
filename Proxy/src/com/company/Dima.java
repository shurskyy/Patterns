package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/8/2016.
 */
public class Dima implements EmployeeI
{
    @Override
    public String getDocuments()
    {
        Mariyana mariyana = new Mariyana();
        return mariyana.getDocuments();
    }
}
