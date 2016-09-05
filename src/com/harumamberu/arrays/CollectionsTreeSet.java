package com.harumamberu.arrays;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionsTreeSet {
    public void arrayList(){
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> myStrings = new TreeSet<>();
        String pointerString;
        do{
            System.out.println("Enter words separated by new line.\nEnter empty line to stop.");
            pointerString = scanner.nextLine();
            if(pointerString.isEmpty()){

            }else{
                myStrings.add(pointerString);
            }
        }while(!(pointerString.isEmpty()));

        Iterator iterator = myStrings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
