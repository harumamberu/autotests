package com.harumamberu.utils.menus;

import com.harumamberu.string.*;


import java.util.Scanner;

public class HW9menu {
    public static void hw9MENU(){
        System.out.println("Choose the task a, b, c or d:");
        switch (new Scanner(System.in).nextLine()){
            case "a": new Builder9a().splitAndSort();
                break;
            case "b": new Builder9b().splitString();
                break;
            case "c": new Builder9c().keyWord();
                break;
        }
    }
}
