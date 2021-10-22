package com.company;

public interface AC {
    int MAX_VOLUME = 30;
    int MIN_VOLUME = 16;

    void powerOn();
    void powerOff();
    void CoolUp();
    void CoolDown();
}