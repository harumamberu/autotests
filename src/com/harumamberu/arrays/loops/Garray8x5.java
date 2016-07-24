package com.harumamberu.arrays.loops;

/**
 * Created by Михаїл on 22.07.2016.
 */
public class Garray8x5 {
    public static void gArray8x5() {
        int[][] gArray = new int[8][5];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                gArray[i][j] = (int) (Math.random()*995) + 5;
                System.out.printf("%3d ", gArray[i][j]);
            }
            System.out.println();
        }



    }
}
