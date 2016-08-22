package com.harumamberu.constructor;

/**
 * Created by Мишка on 15.08.16.
 */
public class Bicycle{
    private int wheelSize;
    private int gear;
    private String color;
    private String brakes;

    public Bicycle(){
        this.wheelSize = 2;
        this.gear = 5;
        this.color = "magnet";
        this.brakes = "disc";
    }

    public Bicycle(int wheelSize){
        this();
        this.wheelSize = wheelSize;
    }

    public Bicycle(int wheelSize, int gear){
        this();
        this.wheelSize = wheelSize;
        this.gear = gear;
    }

    public Bicycle(String color){
        this();
        this.color = color;
    }

    public Bicycle(String color, String brakes){
        this();
        this.color = color;
        this.brakes = brakes;
    }

    public Bicycle(int wheelSize, int gear, String color, String brakes){
        this.wheelSize = wheelSize;
        this.gear = gear;
        this.color = color;
        this.brakes = brakes;
    }
}
