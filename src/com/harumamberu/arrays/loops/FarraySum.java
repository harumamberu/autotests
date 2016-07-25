package com.harumamberu.arrays.loops;

import java.util.Scanner;

/**
 * Created by Михаїл on 24.07.2016.
 */
public class FarraySum {
    public void arrSum() {
        Scanner sc = new Scanner(System.in);

        int number, sum, i, stop;
        stop = 100;
        number = 0;
        sum = 0;
        i = 0;
        String b;
        int[][] fArray = new int[1][stop];

        System.out.println("Input the numbers separated by \'Enter\' to calculate the sum\nInput \'exit\' to stop");
            for (int j = 0; j < stop; j++) {
                b = sc.next();
                switch (b) {
                    case "exit": j = stop;
                        break;
                    default:
                        fArray[i][j] = Integer.parseInt(b);
                        number++;
                }
            }
            for (int s = 0; s < stop; s++){
                sum = sum + fArray[i][s];
            }
        System.out.println("The sum = " + sum);

    }
}








//          int stop = 10000;
//          int number = 0;
//          for ( int i = 0; i < stop; i++){
//              String b = sc.next();
//
//              switch(b){
//                  case "exit": stop = 0;
//                      default: fArray[i] = b;
//             }
//              number++;
//          }



