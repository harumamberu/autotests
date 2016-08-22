package com.harumamberu.arrays.loops;

import com.harumamberu.arrays.ArrayPrint;

public class AevenArray0to20 {
    public static void evenArray0to20() {
        int[][] evenArray = new int[1][10];
        int k = 2;
        for ( int i = 0; i < evenArray.length; i++){
            evenArray[1][i] = k;
            k+=2;
        }
        new ArrayPrint().arrayPrintIn(evenArray);
    }
}
