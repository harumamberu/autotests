package com.harumamberu.utils.calculators;

import java.util.Scanner;

/**
 * Created by Мишка on 20.07.16.
 */
public class EvenOddNumbers {
    public static void evenodd() {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n1 = (int) sc.nextDouble();
        if ( n1 % 2 == 0){
            System.out.println("The number " + n1 + " is even");
        } else {
            System.out.println("The number " + n1 + " is odd");
        }
    }
}
