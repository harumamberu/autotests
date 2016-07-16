package com.harumamberu.utils.castings;

public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.14169f;

    public void narrowRunner(){
        int1 = (int) float1;
        System.out.println(int1);
    }
}
