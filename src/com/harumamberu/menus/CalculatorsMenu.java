package com.harumamberu.menus;

import com.harumamberu.utils.calculators.*;
import com.harumamberu.utils.castings.*;

import java.util.Scanner;

public class CalculatorsMenu {
    public static void calculatorsMenu() {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        do {
            System.out.println("_______________________");
            System.out.println("Enter number to choose:\n_______________________\n 1 to calculate a circle area.\n 2 to check triangle sides.\n 3 to define even/odd numbers.");
            System.out.println(" 4 to run narrowing casting.\n 5 to run widening casting.");
            System.out.println("10 to finish.");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    CircleArea.calculate();
                    break;
                case 2:
                    Triangle.calculateTriangle();
                    break;
                case 3:
                    EvenOddNumbers.evenodd();
                    break;
                case 4:
                    NarrowingCasting nc1 = new NarrowingCasting();
                    nc1.narrow();
                    break;
                case 5:
                    WideningCasting wc1 = new WideningCasting();
                    wc1.widening();
                    break;
                case 10: k++;
                    break;
                default:
                    System.out.println("You have made incorrect choice");
            }
        }while (k == 0);
        }
    }

