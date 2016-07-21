package com.harumamberu.utils.loop;

import java.util.Scanner;

/**
 * Created by Мишка on 18.07.16.
 */
public class CompareAB {
    public void aB(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();

        if ( a > b ) {
            do {a--;
            System.out.println("A = " + a + "\nB = " + b);}
            while ( a > b );

        } else {
            System.out.println("A = " + a + "\nB = " + b);
        }
    }
}
