package com.harumamberu.arrays.loops;

/**
 * Created by Мишка on 21.07.16.
 */
public class SortArray {


    public static void main(String[] args) {

        int flag = 0;
        int[] sortA = new int[10];
        int k = 10;
        for (int i = 0; i<10; i++){
            sortA[i] = k;
            k--;
        }
        do {flag = 0;
            int b = 0;
            for (int i=0; i<9; i++){
                if (sortA[i] > sortA[i+1]){
                    b = sortA[i+1];
                    flag++;
                    sortA[i+1]=sortA[i];
                    sortA[i]=b;
                }
            }
        } while (flag != 0);
        for (int i : sortA){
        System.out.print(" " + i);}
    }
}
