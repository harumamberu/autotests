package com.harumamberu.menus;


import com.harumamberu.arrays.ArrayPrint;
import com.harumamberu.polymorphism.RandomArrayParametrizedCreator;

import java.util.Scanner;

public class PolymorphMenu {
    public void menu() {

        switch(new Scanner(System.in).nextLine()){
            case "a1":
                new ArrayPrint().arrayPrintIn(new RandomArrayParametrizedCreator(10, 0, 100).create(10, 0 , 100));
                break;
            case "a2":
                new ArrayPrint().arrayPrintIn(new RandomArrayParametrizedCreator(10, 5, 0, 100).create(10, 5, 0, 100));
                break;
            case "a3":
                new ArrayPrint().arrayPrintIn(new RandomArrayParametrizedCreator(10, 5, 0, 100).create(10, 0, 100));
                break;
        }
    }
}
