package com.harumamberu.utils.runners;

import com.harumamberu.arrays.ArrayPrint;
import com.harumamberu.arrays.PeckOfSortsArray;

import java.util.Scanner;

/**
 * Created by Мишка on 02.08.16.
 */
public class ArrayPrintRun {
    public static void main(String[] args) {
        ArrayPrint objAP = new ArrayPrint();
        PeckOfSortsArray objPOSA = new PeckOfSortsArray();
        int[][] a1 = objAP.arrRandomValue();
        objAP.arrayPrintIn(a1);


        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number to choose act:\n1 sort from min to max\n2 sort from max to min\n3 find min value");
        String i = sc.next();
        switch(i){
            case "1":
                int[][] min2max = objPOSA.sortMinToMax(a1);
                objAP.arrayPrintOut(min2max);
                break;
            case "2":
                int[][] max2min = objPOSA.sortMaxToMin(a1);
                objAP.arrayPrintOut(max2min);
                break;
            case "3":
                int maxV = objPOSA.maxValue(a1);
                System.out.println("\n" + maxV);
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}
