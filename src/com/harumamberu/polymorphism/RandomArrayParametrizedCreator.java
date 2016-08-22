package com.harumamberu.polymorphism;


import com.sun.istack.internal.Nullable;

public class RandomArrayParametrizedCreator extends RandomArrayCreator {

    public RandomArrayParametrizedCreator(int length){
        super();
        setLength(length);
    }

    public RandomArrayParametrizedCreator(int length, int width){
        super();
        setLength(length);
        setWidth(width);
    }


    @Override
    public int[] create(int length){
        if(getWidth() != 0){
            return null;
        }
        return super.create(getLength());
    }


    @Override
    public int[][] create(int length, int width){
        if(getWidth() == 0){
            return null;
        }
        return super.create(getLength(), getWidth());
    }
}
