package com.harumamberu.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWords {
    public static void main(String[] args) {
        new ArrayListWords().arrayList();
    }
    public void arrayList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myStringsList = new ArrayList<String>();
        String pointerString;
        do{
            pointerString = scanner.nextLine();
            if(pointerString.isEmpty()){

            }else{
                myStringsList.add(pointerString);
            }
        }while(pointerString.isEmpty());
        System.out.println(myStringsList);
    }
}
