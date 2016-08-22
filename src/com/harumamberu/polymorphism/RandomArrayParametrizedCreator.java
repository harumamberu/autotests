package com.harumamberu.polymorphism;


public class RandomArrayParametrizedCreator extends RandomArrayCreator {


    public RandomArrayParametrizedCreator(int length, int minV, int maxV){
        this.length = length;
        this.minV = minV;
        this.maxV = maxV;
    }

    public RandomArrayParametrizedCreator(int length, int width, int minV, int maxV){
        this.length = length;
        this.width = width;
        this.minV = minV;
        this.maxV = maxV;
    }

    @Override
    public int[][] create(int length, int minV, int maxV){
        return super.create(length, minV, maxV);
    }

    @Override
    public int[][] create(int length, int width, int minV, int maxV){
        return super.create(length, width, minV, maxV);
    }
}
