package com.harumamberu.utils.calculators;

import java.util.Scanner;

public class CircleArea {
    public static final double PI = 3.14d;
       public static void calculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();

        //System.out.println("Enter needed accuracy for PI");
        //double accuracyPi = scanner.nextDouble();

        double circleArea = PI * radius * radius;
        System.out.println("Area is " + circleArea);
       //second circle
        System.out.println("Enter the radius for second circle");
        double radius2 = scanner.nextDouble();

        //System.out.println("Enter needed accuracy for PI");
        //double accuracyPi = scanner.nextDouble();

        double circleArea2 = PI * radius2 * radius2;
        System.out.println("Area is " + circleArea2);

        if (circleArea > circleArea2){
            System.out.println("Circle #1 is bigger");
            }
        else {
            System.out.println("Circle #2 is bigger");
        }
    }
}
