package com.harumamberu.utils.castings;

import java.util.Scanner;

public class NarrowingCasting {
    int int1 = 0;


    public void narrow(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the float number for casting to integer");
        float float1 = sc.nextFloat();
        int1 = (int) float1;
        System.out.println(int1);
    }
}
