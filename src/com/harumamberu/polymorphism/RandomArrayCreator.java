package com.harumamberu.polymorphism;

import com.harumamberu.arrays.*;

public class RandomArrayCreator {
    int length, width, minV, maxV;

    public int[][] create(int length, int minV, int maxV){
        width = 1;
        return new ArrayPrint().arrRandomValue(length, width, minV, maxV);
    }

    public int[][] create(int length, int width, int minV, int maxV){
        return new ArrayPrint().arrRandomValue(length, width, minV, maxV);
    }
}
