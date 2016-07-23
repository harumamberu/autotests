package com.harumamberu.menus;

import com.harumamberu.utils.calculators.CircleArea;
import com.harumamberu.utils.calculators.EvenOddNumbers;
import com.harumamberu.utils.calculators.Triangle;

import java.util.Scanner;

public class MenuIfBased {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of iterations for the menu");
        int i = scanner.nextInt();
        do {
            if ( i < 1 ){
                break;
            }
            i--;
            System.out.println("Enter number to choose:\n 1 to calculate a circle area.\n 2 to check triangle sides.\n 3 to define even/odd numbers.\n 10 to finish.");
            int pointer = scanner.nextInt();
            if (pointer == 1){
                CircleArea.calculate();
            }
            if (pointer == 2){
                Triangle.calculateTriangle();
            }
            if (pointer == 3){
                EvenOddNumbers.evenodd();
            }
            if (pointer == 10){
                break;
            }
        }while ( i != 0 );
    }
}
