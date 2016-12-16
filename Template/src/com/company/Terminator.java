package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/16/2016.
 */
public class Terminator extends Cyborg
{
    @Override
    void installSkinCoverage()
    {
        System.out.println("Skin coverage installed");
    }

    @Override
    void uploadTarget()
    {
        System.out.println("Target for termination uploaded");

    }

    @Override
    void installHumanAnatomyKnowledge()
    {
        System.out.println("Human anatomy added to DB");

    }

    @Override
    void installLanguageKnowledge()
    {
        System.out.println("English, Body Language added to DB");

    }

    @Override
    void installPatrolProtocol(){}

    @Override
    void addJetEngine(){}
}
