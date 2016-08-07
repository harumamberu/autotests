package com.harumamberu.arrays.loops;

import static com.harumamberu.arrays.ArrayPrint.*;

/**
 * Created by Михаїл on 22.07.2016.
 */
public class BoddArray1to99 {
    public static void oddArray1to99() {
        int[][] oddArray = new int[1][50];
        int i = 0;
        for ( int k = 0; k < 100 || i < oddArray.length; k++){

            if (k%2==1){
                oddArray[1][i] = k;
                i++;
            }
        }

        arrayPrintIn(oddArray);
        System.out.println();
        int length = oddArray.length;
        for (int j = length - 1; j > -1; j--){
            System.out.printf("%2d ", oddArray[1][j]);
        }
    }
}
