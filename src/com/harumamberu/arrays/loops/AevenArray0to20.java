package com.harumamberu.arrays.loops;

/**
 * Created by Михаїл on 22.07.2016.
 */
public class AevenArray0to20 {
    public static void evenArray0to20() {
        int[] evenArray = new int[10];
        int k = 2;
        for ( int i = 0; i < evenArray.length; i++){
            evenArray[i] = k;
            System.out.print(" " + evenArray[i]);
            k+=2;
        }

        for (int i = 0; i < evenArray.length; i++){
            System.out.print("\n" + evenArray[i]);
        }
    }
}
