package com.harumamberu.arrays.loops;

/**
 * Created by Мишка on 21.07.16.
 */
public class SortArray {


    public static void main(String[] args) {

        int flag = 0;
        int[] arr = new int[15];
        int min, minInd, sort;
            for (int j = 0; j < 15; j++){
                arr[j] = (int) (Math.random()*995) + 5;
                System.out.printf("%3d ", arr[j]);
            }
            System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            minInd = i;
            for (int j = i+1; j < arr.length; j++) {
               if ( arr[minInd] > arr[j] ){
                   minInd = j;
               }
            }
            sort = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = sort;


        }




        for (int i : arr) {
            System.out.printf("%3d ", i);
        }

    }
}
