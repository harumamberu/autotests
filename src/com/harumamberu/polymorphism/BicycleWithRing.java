package com.harumamberu.polymorphism;


public class BicycleWithRing implements BicycleWithRingInterface{

    @Override
    public void ring(){
        System.out.println("Di-ling!");
    }

    public static void main(String[] args) {
        BicycleWithRingInterface reference = new BicycleWithRing();
        reference.ring();
    }
}
