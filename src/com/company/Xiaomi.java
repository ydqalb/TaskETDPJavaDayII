package com.company;

public class Xiaomi implements AC {

    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        // set volume awal
        this.volume = 22;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("AC menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("AC dimatikan");
    }

    @Override
    public void CoolUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Suhu FULL!!");
                System.out.println("sudah " + this.getVolume() + "C");
            } else {
                this.volume += 1;
                System.out.println("Suhu sekarang: " + this.getVolume() + " C");
            }
        } else {
            System.out.println("Nyalakan dulu donk AC-nya!!");
        }
    }

    @Override
    public void CoolDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Suhu = 27C");
            } else {
                this.volume -= 1;
                System.out.println("Suhu sekarang: " + this.getVolume() + " C");
            }
        } else {
            System.out.println("Nyalakan dulu donk AC-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}
