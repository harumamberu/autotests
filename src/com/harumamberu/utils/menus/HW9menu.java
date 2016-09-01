package com.harumamberu.utils.menus;

import com.harumamberu.string.*;
import com.harumamberu.string.code.Enigma;


import java.util.Scanner;

public class HW9menu {
    boolean stop = false;
    public void hw9MENU(){
        do{
            try{
                System.out.println("\nChoose the task a, b, c or d:");
                Tasks switcher = Tasks.valueOf(new Scanner(System.in).nextLine().toUpperCase());
                switch (switcher){
                    case A: new Builder9a().splitAndSort();
                        break;
                    case B: new Builder9b().splitString();
                        break;
                    case C: new Builder9c().keyWord();
                        break;
                    case D: new Enigma().enigmaMenu();
                        break;
                    case S: stop = true;
                        default:
                            System.out.println("Wrong input. Try again.");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Wrong input. Try again.");
            }

        }while (stop==false);
    }
}
