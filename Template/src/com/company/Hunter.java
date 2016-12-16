package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/16/2016.
 */
public class Hunter extends Cyborg
{
    @Override
    void installSkinCoverage(){}

    @Override
    void uploadTarget(){}

    @Override
    void installHumanAnatomyKnowledge(){}

    @Override
    void installLanguageKnowledge(){}

    @Override
    void installPatrolProtocol()
    {
        System.out.println("Patrol Protocol installed");
    }

    @Override
    void addJetEngine()
    {
        System.out.println("Jet Engine installed");
    }
}
