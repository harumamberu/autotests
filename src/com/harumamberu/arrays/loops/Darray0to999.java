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

        do { flag = 0;
            for ( int i = 0; i < 14; i++){
                if ( sort[i] > sort[i+1]){
                    int b;
                    b = sort[i];
                    sort[i] = sort[i+1];
                    sort[i+1] = b;
                    flag++;
                }
            }
        }while (flag != 0);
        System.out.println("\nThe lowest value in array is " + arr0to999[0] + ".\nThe biggest value in array is " + arr0to999[14] + ".");
////////////////////////////////////////////////////
    }
}
