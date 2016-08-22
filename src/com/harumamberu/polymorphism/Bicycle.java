package com.harumamberu.polymorphism;

public abstract class Bicycle {
    String sound;

    public Bicycle(){
        this.sound = "Wroom";
    }

    public void ride(String sound){
        System.out.println(sound);
    }

    public abstract void setSpeed(int speed);
    public abstract void setGear(int gear);
}
