package com.harumamberu.polymorphism;

import com.harumamberu.arrays.*;

public class RandomArrayCreator {
    private int length, width, minV, maxV;

    public RandomArrayCreator(){
        setMinV(0);
        setMaxV(100);
    }

    public int[] create(int length){
        return new ArrayPrint().arrRandomValue(length, minV, maxV);
    }

    public int[][] create(int length, int width){
        return new ArrayPrint().arrRandomValue(length, width, minV, maxV);
    }

//----------------------------------------------------------------------------------------------
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getMinV() {
        return minV;
    }

    public void setMinV(int minV) {
        this.minV = minV;
    }

    public int getMaxV() {
        return maxV;
    }

    public void setMaxV(int maxV) {
        this.maxV = maxV;
    }
}
