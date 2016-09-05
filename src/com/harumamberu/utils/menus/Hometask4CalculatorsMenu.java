package com.harumamberu.utils.menus;

import com.harumamberu.utils.calculators.*;
import com.harumamberu.utils.castings.*;
import com.harumamberu.utils.loop.CompareAB;

import java.util.Scanner;

public class Hometask4CalculatorsMenu {
    public static void calculatorsMenu() {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        do {
            try {
                System.out.println("" +
                        "\nEnter number to choose:" +
                        "\n_______________________" +
                        "\n A to calculate a circle area." +
                        "\n B to check triangle sides." +
                        "\n C to define even/odd numbers." +
                        "\n D to run narrowing casting." +
                        "\n E to run widening casting." +
                        "\n F to campare numbers");
                System.out.println("S to finish.");
                Tasks switcher = Tasks.valueOf(scanner.nextLine());
                switch (switcher) {
                    case A:
                        CircleArea.calculate();
                        break;
                    case B:
                        Triangle.calculateTriangle();
                        break;
                    case C:
                        EvenOddNumbers.evenodd();
                        break;
                    case D:
                        NarrowingCasting nc1 = new NarrowingCasting();
                        nc1.narrow();
                        break;
                    case E:
                        WideningCasting wc1 = new WideningCasting();
                        wc1.widening();
                        break;
                    case F:
                        new CompareAB().compareAB();
                        break;
                    case S:
                        k++;
                        break;
                    default:
                        System.out.println("You have made incorrect choice");
                }
            }catch(IllegalArgumentException e){
                System.out.println("You have made incorrect choice");
            }
        }while (k == 0);
        }
    }

