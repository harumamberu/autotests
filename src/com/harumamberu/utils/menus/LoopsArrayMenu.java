package com.harumamberu.utils.menus;

import com.harumamberu.arrays.loops.*;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsArrayMenu {
    public void loopArrayMenu() {
        int stop = 0;
        do {
            try {
                System.out.println("\nEnter the symbol to choose equal array:\n"
                        + Arrays.toString(Tasks.values()) + "\nEnter 'S' to stop.");

                Tasks enterTask = Tasks.valueOf(new Scanner(System.in)
                        .nextLine().toUpperCase());

                switch (enterTask) {
                    case A:
                        new AevenArray0to20().evenArray0to20();
                        break;
                    case B:
                        BoddArray1to99.oddArray1to99();
                        break;
                    case C:
                        CarrayRandom15.arrayRandom15();
                        break;
                    case D:
                        Darray0to999.dArray0to999();
                        break;
                    case G:
                        Garray8x5.gArray8x5();
                        break;
                    case E:
                        Earray8x5.eArr8x5();
                        break;
                    case F:
                        FarraySum farr = new FarraySum();
                        farr.arrSum();
                        break;
                    case S:
                        ++stop;
                        break;
                }
            }catch(IllegalArgumentException e) {
                System.out.println("You have made incorrect choice. Please enter one if the next values" + Arrays.toString(Tasks.values()));
            }
        }while(stop==0);
    }
}

