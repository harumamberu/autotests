package com.harumamberu.utils.calculators;

import java.util.Scanner;
public class CircleArea {
    public static final double PI = 3.14d;
       public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();

        System.out.println("Enter needed accuracy for PI");
        double accuracyPi = scanner.nextDouble();


        double circleArea = PI * radius * radius;
        System.out.println("Area is " + circleArea);
    }

}
