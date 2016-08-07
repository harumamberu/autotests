package com.harumamberu.arrays.loops;

import static com.harumamberu.arrays.ArrayPrint.*;

/**
 * Created by Михаїл on 22.07.2016.
 */
public class CarrayRandom15 {
    public static void arrayRandom15(){
        int[][] array15 = arrRandomValue(15, 1, 0, 9);
        arrayPrintIn(array15);
        int numberEven = 0;
        for (int i = 0; i < array15.length; i++){
            if ((array15[i][1]%2==0)){
                numberEven++;
            }
        }
        System.out.println("\nNumber of even digits in \'array15\': " + numberEven);
    }
}
