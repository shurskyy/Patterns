package com.company;

/**
 * Created by Serhiy_Hurskyy on 12/16/2016.
 */
abstract public class Cyborg
{
    final void makeCyborg(){
        installCPU();

        if(skyNetNeedsPatrolUnit()){
            installPatrolProtocol();
            addJetEngine();
        }
        if(skyNetNeedsTerminator()){
            installSkinCoverage();
            uploadTarget();
            installHumanAnatomyKnowledge();
           installLanguageKnowledge();
        }
    }
    public void installCPU(){
        System.out.println("CPU with AI installed");
    }

    abstract void installSkinCoverage();
    abstract void uploadTarget();
    abstract void installHumanAnatomyKnowledge();
    abstract void installLanguageKnowledge();
    abstract void installPatrolProtocol();
    abstract void addJetEngine();

    boolean skyNetNeedsPatrolUnit(){return true;}
    boolean skyNetNeedsTerminator(){return true;}
}
