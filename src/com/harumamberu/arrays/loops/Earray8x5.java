package com.harumamberu.arrays.loops;

/**
 * Created by Михаїл on 22.07.2016.
 */
public class Earray8x5 {
    public static void eArr8x5() {
        int[][] eArr = new int[8][5];

        for ( int i = 0; i < 8; i++){
            for ( int j = 0; j < 5; j++){
                eArr[i][j] = (int) ((Math.random() * 90) + 10);
            }
        }
        for ( int i = 0; i < 8; i++){
            for ( int j = 0; j < 5; j++){
                System.out.print(eArr[i][j] + " ");;
            }
            System.out.println();
        }


    }
}
