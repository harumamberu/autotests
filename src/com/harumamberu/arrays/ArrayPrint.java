package com.harumamberu.arrays;

import com.harumamberu.utils.menus.ArrayPrintMenu;

import java.util.Scanner;



public class ArrayPrint {
    public void initialArr(){
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
        ArrayPrintMenu.menu(arrRandom);
    }

    public int[] arrRandomValue(int l, int minV, int maxV){
        int[] arrRandomV = new int[l];
        int[] arrIn = arrRandomV;
            for (int i = 0; i < l; i++) {
                arrRandomV[i] = (int) ((Math.random() * (maxV + 1 - minV)) + minV);
            }
        return arrIn;
    }

    public int[][] arrRandomValue(int l, int w, int minV, int maxV){
        int[][] arrRandomV = new int[w][l];
        int[][] arrIn = arrRandomV;
        for(int j = 0; j < w; j++) {
            for (int i = 0; i < l; i++) {
                arrRandomV[j][i] = (int) ((Math.random() * (maxV + 1 - minV)) + minV);
            }
        }
        return arrIn;
    }



    public void arrayPrintIn(int[] arrIn){
        System.out.println("Incoming array:");
        for (int j = 0; j < arrIn.length;j++) {
                System.out.printf("%4d ", arrIn[j]);
        }
        System.out.println();
    }

    public void arrayPrintIn(int[][] arrIn){
        System.out.println("Incoming array:");
        for (int j = 0; j < arrIn.length;j++) {
            for (int i = 0; i < arrIn[j].length;i++) {
                System.out.printf("%4d ", arrIn[j][i]);
            }
            System.out.println();
        }
    }



    public void arrayPrintOut(int[][] arrOut){
        System.out.println("Sorted array:");
        for (int j = 0; j < arrOut.length; j++) {
            for (int i = 0; i < arrOut[j].length; i++) {
                System.out.printf("%4d ", arrOut[j][i]);
            }
            System.out.println();
        }
    }

    public void arrayPrintOut(String[] arrOut){
        System.out.println("Sorted array:");
        for (int j = 0; j < arrOut.length; j++) {
            System.out.printf("%5d ", Integer.parseInt(arrOut[j]));
        }
        System.out.println();
    }


}
