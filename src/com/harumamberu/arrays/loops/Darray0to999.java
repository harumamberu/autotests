package com.harumamberu.arrays.loops;


import static com.harumamberu.arrays.ArrayPrint.*;
import static com.harumamberu.arrays.SortsArray.*;

public class Darray0to999 {
    public static void dArray0to999() {
        int[][] arr = arrRandomValue(15, 1, 0, 999);
        arrayPrintIn(arr);
        System.out.println("\nThe lowest value in array is " + minValue(arr) + ".\nThe biggest value in array is " + maxValue(arr) + ".");

    }
}
