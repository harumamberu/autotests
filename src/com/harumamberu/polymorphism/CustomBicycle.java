package com.harumamberu.polymorphism;


public class CustomBicycle extends Bicycle {
    int speed, gear;

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println(this.gear);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(this.speed);
    }
    
}