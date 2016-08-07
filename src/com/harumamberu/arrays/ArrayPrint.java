package com.harumamberu.arrays;

import java.util.Scanner;

import static com.harumamberu.arrays.SortsArray.*;

/**
 * Created by Михаїл on 25.07.2016.
 */
public class ArrayPrint {
    public static void initial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array width");
        int w = sc.nextInt();//array length
        System.out.println("Enter the array length");
        int l = sc.nextInt();//array length
        System.out.println("Enter the bottom bound value");
        int minV = sc.nextInt();//bottom bound value
        System.out.println("Enter the upper bound value");
        int maxV = sc.nextInt();//upper bound value
        int[][] arrRandom = arrRandomValue(w, l, minV, maxV);
        arrayPrintIn(arrRandom);
        menu(arrRandom, w, l, minV, maxV);
    }

    public static void menu(int[][] arrRandom, int w, int l, int minV, int maxV){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number to choose act:\n1 sort from min to max\n2 sort from max to min\n3 find max value\n4 selection sort from min to max");
        String i = sc.next();
        switch(i){
            case "1": arrayPrintOut(sortMinToMax(arrRandom));
                break;
            case "2": arrayPrintOut(sortMaxToMin(arrRandom));
                break;
            case "3": System.out.println(maxValue(arrRandom));
                break;
            case "4": arrayPrintOut(selectionSortMax2Min(arrRandom));
                break;
            default: System.out.println("Wrong input.");
        }
    }

    public static int[][] arrRandomValue(int w, int l, int minV, int maxV){
        int[][] arrRandomV = new int[w][l];
        int[][] arrIn = arrRandomV;
        for(int j = 0; j < w; j++) {
            for (int i = 0; i < l; i++) {
                arrRandomV[j][i] = (int) ((Math.random() * (maxV + 1 - minV)) + minV);
            }
        }
        return arrIn;
    }

    public static void arrayPrintIn(int[][] arrIn){
        System.out.println("Incoming array:");
        for (int j = 0; j < arrIn.length;j++) {
            for (int i = 0; i < arrIn[j].length;i++) {
                System.out.printf("%4d ", arrIn[j][i]);
            }
            System.out.println();
        }

    }

    public static void arrayPrintOut(int[][] arrOut){
        System.out.println("Sorted array:");
        for (int j = 0; j < arrOut.length; j++) {
            for (int i = 0; i < arrOut[j].length; i++) {
                System.out.printf("%4d ", arrOut[j][i]);
            }
            System.out.println();
        }
    }


}
