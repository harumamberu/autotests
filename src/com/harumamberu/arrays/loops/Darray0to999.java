package com.harumamberu.arrays.loops;


public class Darray0to999 {
    public static void dArray0to999() {
        int[] arr0to999 = new int [15];
        int[] sort = arr0to999;
        int flag;

        for ( int i = 0; i < arr0to999.length; i++){
            arr0to999[i] = (int) (Math.random()*1000);
        }
        for (int i = 0; i < arr0to999.length; i++){
            if ( i != 14 ) {
                System.out.print(arr0to999[i] + ", ");
            }else{
                System.out.print(arr0to999[14]);
            }
        }

////////////////////////////////////////////////////
        int i = 0;
        int min = sort[i];
        int max = sort[i];
            for ( i = 0; i < sort.length; i++){
                if ( sort[i] > max){
                    max = sort[i];
                }
                if ( sort[i] < min){
                    min = sort[i];
                }
            }

        System.out.println("\nThe lowest value in array is " + min + ".\nThe biggest value in array is " + max + ".");
////////////////////////////////////////////////////
    }
}
