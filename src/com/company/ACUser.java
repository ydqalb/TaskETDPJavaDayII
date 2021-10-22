package com.company;

public class ACUser {
    private AC ac;

    public ACUser(AC ac) {
        this.ac = ac;
    }

    void turnOnTheAC(){
        this.ac.powerOn();
    }

    void turnOffTheAC(){
        this.ac.powerOff();
    }

    void makePhoneLouder(){
        this.ac.CoolUp();
    }

    void makePhoneSilent(){
        this.ac.CoolDown();
    }
}
