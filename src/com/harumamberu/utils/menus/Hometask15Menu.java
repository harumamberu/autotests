package com.harumamberu.utils.menus;

import com.harumamberu.arrays.ArrayPrint;
import com.harumamberu.arrays.ArraySorterGenerics;
import com.harumamberu.arrays.CollectionsTreeSet;

import java.util.Scanner;

public class Hometask15Menu extends Menu{
    public void menu(){
        do{
            try{
                System.out.println("\nEnter A,B to choose task:");
                Tasks switcher = Tasks.valueOf(new Scanner(System.in).nextLine().toUpperCase());
                switch (switcher){
                    case A:
                        int[] ints = ArrayPrint.arrRandomValue(10, 0, 199);
                        Integer[] integers = new Integer[ints.length];

                        for (int i = 0; i < ints.length; i++) {
                            integers[i] = Integer.valueOf(ints[i]);
                        }
                        new ArraySorterGenerics(integers).sortArrGeneric();

                        for(Integer i:integers){
                            System.out.printf("%4d", i);
                        }
                        break;
                    case B:
                        new CollectionsTreeSet().arrayList();
                        break;
                    case S:
                        stop = true;
                        break;
                    default:
                        System.out.println("Wrong input. Try again.");

                }
            }catch (IllegalArgumentException e){
                System.out.println("Wrong input. Try again.");
            }
        }while(stop==false);
    }
}
