package com.harumamberu.utils.calculators;

import java.util.Scanner;

public class Triangle {

    public void calculateTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of hypotenuse C");
        double c = scanner.nextDouble();
        System.out.println("Enter the length of cathetus A");
        double a = scanner.nextDouble();
        System.out.println("Enter the length of cathetus B");
        double b = scanner.nextDouble();
        if ( (c * c == (a * a)+(b * b))){
            System.out.println("This digits can be angled triangle sides");
        }
        else {
            System.out.println("This digits can't form the right-angled triangle");
        }
    }
}
