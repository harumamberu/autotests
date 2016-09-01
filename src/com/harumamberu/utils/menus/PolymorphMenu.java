package com.harumamberu.utils.menus;


import com.harumamberu.arrays.ArrayPrint;
import com.harumamberu.polymorphism.RandomArrayParametrizedCreator;

import java.util.Scanner;

public class PolymorphMenu {
    boolean flag = true;
    public void menu() {
        do{
            switch(new Scanner(System.in).nextLine()){
                case "a1":
                    new ArrayPrint().arrayPrintIn(new RandomArrayParametrizedCreator(10).create(10));
                    break;
                case "a2":
                    new ArrayPrint().arrayPrintIn(new RandomArrayParametrizedCreator(10, 5).create(10, 5));
                    break;
                case "a3":
                    new ArrayPrint().arrayPrintIn(new RandomArrayParametrizedCreator(10).create(10,5));
                    break;
                case "a4":
                    new ArrayPrint().arrayPrintIn(new RandomArrayParametrizedCreator(10,5).create(10,5));
                    break;
                case "c1":
                case "exit": flag = false;
            }
        }while(flag);
    }
}
