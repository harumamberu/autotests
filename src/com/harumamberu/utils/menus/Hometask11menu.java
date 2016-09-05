package com.harumamberu.utils.menus;

import com.harumamberu.polymorphism.Human;
import com.harumamberu.polymorphism.WhiteCollar;

import java.util.Scanner;

public class Hometask11menu extends Menu{
    public void menu(){
        WhiteCollar ori = new WhiteCollar("Oriana", 25, "TicketsUA");
        ori.setlegalchars();
        do{
            try{
                System.out.println("\nEnter A to set age 26\nB to set age 0\nC to set VALID company name\nD to set INVALID company name");
                Tasks switcher = Tasks.valueOf(new Scanner(System.in).nextLine().toUpperCase());
                switch (switcher){
                    case A:
                        ori.setAge(26);
                        break;
                    case B:
                        ori.setAge(0);
                        break;
                    case C:
                        ori.setCompanyName("Google, Inc-");
                        break;
                    case D:
                        ori.setCompanyName("Goggle+");
                        break;
                    case S: stop = true;
                        break;
                    default:
                        System.out.println("Wrong input. Try again.");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Wrong input. Try again.");
            }

        }while (stop==false);
    }
}
