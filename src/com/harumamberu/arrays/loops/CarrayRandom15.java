package com.harumamberu.arrays.loops;

import com.harumamberu.arrays.ArrayPrint;

public class CarrayRandom15 {
    public static void arrayRandom15(){
        int[][] array15 = new ArrayPrint().arrRandomValue(15, 1, 0, 9);
        new ArrayPrint().arrayPrintIn(array15);
        int numberEven = 0;
        for (int i = 0; i < array15.length; i++){
            if ((array15[i][1]%2==0)){
                numberEven++;
            }
        }
        System.out.println("\nNumber of even digits in \'array15\': " + numberEven);
    }
}
