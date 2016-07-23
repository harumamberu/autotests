package com.harumamberu.arrays.loops;

/**
 * Created by Михаїл on 22.07.2016.
 */
public class CarrayRandom15 {
    public static void arrayRandom15(){
        int[] array15 = new int[15];
        for (int i = 0; i < array15.length; i++){
            array15[i] = (int) (Math.random() * 10);
        }

        for (int j = 0; j < array15.length; j++){
            System.out.print(array15[j]+ " ");
        }

        int numberEven = 0;
        for (int i = 0; i < array15.length; i++){
            if ((array15[i]%2==0)){
                numberEven++;
            }
        }
        System.out.println("\nNumber of even digits in \'array15\': " + numberEven);
    }
}
