package com.harumamberu.polymorphism;

/**
 * Created by Михаїл on 22.08.2016.
 */
public abstract class Bicycle {
    public void ride(){
        System.out.println("Wrooom!");
    }

    public abstract void setSpeed(int speed);
    public abstract void setGear(int gear);
}
