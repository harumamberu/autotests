package com.harumamberu.arrays;

import java.util.Scanner;

/**
 * Created by Михаїл on 25.07.2016.
 */
public class ArrayPrint {
    public int[] arrRandomValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int l = sc.nextInt();//array length
        System.out.println("Enter the bottom bound value");
        int minV = sc.nextInt();//bottom bound value
        System.out.println("Enter the bottom bound value");
        int maxV = sc.nextInt();//upper bound value

        int[] arrRandomV = new int[l];
        for(int i = 0; i < l-1; i++){
            arrRandomV[i] = (int) (Math.random()*minV - maxV);
        }
        return arrRandomV;
    }

    public int[] arrayPrintIn(int[] arrRandomValue){

    }



}
