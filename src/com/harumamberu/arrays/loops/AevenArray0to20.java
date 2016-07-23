package com.harumamberu.arrays.loops;

/**
 * Created by Михаїл on 22.07.2016.
 */
public class AevenArray0to20 {
    public static void evenArray0to20() {
        int[] evenArray = new int[10];
        int k = 2;
        for ( int i = 0; ( i > -1 ) && ( i < 10); i++){
            evenArray[i] = k;
            k+=2;
        }
        for ( int i : evenArray ){
            System.out.print(" " + i);
        }
        for ( int i : evenArray ){
            System.out.print("\n" + i);
        }
    }
}
