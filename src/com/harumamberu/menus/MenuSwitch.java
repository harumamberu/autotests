package com.harumamberu.menus;

import com.harumamberu.utils.calculators.CircleArea;
import com.harumamberu.utils.calculators.EvenOddNumbers;
import com.harumamberu.utils.calculators.Triangle;

import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to choose:\n 1 to calculate a circle area.\n 2 to check triangle sides.\n 3 to define even/odd numbers.\n 10 to finish.");
        int i = scanner.nextInt();

        switch (i){
            case 1:   CircleArea.calculate();
                break;
            case 2:   Triangle.calculateTriangle();
                break;
            case 3: EvenOddNumbers.evenodd();
                break;
            case 10: break;
            default: System.out.println("You have made incorrect choice");
            }
        }
    }

