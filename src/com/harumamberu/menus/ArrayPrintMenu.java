package com.harumamberu.menus;

import com.harumamberu.arrays.ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

import static com.harumamberu.arrays.SortsArray.*;
import static com.harumamberu.arrays.ArrayPrint.*;

public class ArrayPrintMenu {
    public static void menu(int[][] arrRandom){
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        ArrayPrint arrayPrint = new ArrayPrint();
        do {
            try {
                System.out.println("\nEnter symbols to choose act:" +
                        "\nA - sort from min to max\nB - sort from max to min" +
                        "\nC - find max value\nD - selection sort from min to max\nS - stop.");
                String i = sc.next();
                Tasks switcher = Tasks.valueOf(i.toUpperCase());
                switch (switcher) {
                    case A:
                        arrayPrint.arrayPrintOut(sortMinToMax(arrRandom));
                        break;
                    case B:
                        arrayPrint.arrayPrintOut(sortMaxToMin(arrRandom));
                        break;
                    case C:
                        System.out.println(maxValue(arrRandom));
                        break;
                    case D:
                        arrayPrint.arrayPrintOut(selectionSortMax2Min(arrRandom));
                        break;
                    case S:
                        flag = true;
                        default:System.out.print("!!!!!!!!!!!!!!!!!!\n!!!Wrong input.!!!\n!!!!!!!!!!!!!!!!!!");
                }
            } catch (IllegalArgumentException e) {
                System.out.print("!!!!!!!!!!!!!!!!!!\n!!!Wrong input.!!!\n!!!!!!!!!!!!!!!!!!");
            }
        }while (flag==false);
    }

}
