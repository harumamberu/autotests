package com.harumamberu.arrays.loops;

/**
 * Created by Мишка on 21.07.16.
 */
public class SortArray {


    public static void main(String[] args) {

        int flag = 0;
        int[] arr = new int[5];

            for (int j = 0; j < 5; j++){
                arr[j] = (int) (Math.random()*995) + 5;
                System.out.printf("%3d ", arr[j]);
            }
            System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                int leftNumber = arr[j];
                if (num < leftNumber) {
                    arr[j + 1] = leftNumber;
                    arr[j] = num;
                }
            }
        }




        for (int i : arr) {
            System.out.printf("%3d ", i);
        }

    }
}
