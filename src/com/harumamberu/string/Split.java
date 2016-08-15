package com.harumamberu.string;

import java.util.Scanner;

/**
 * Created by Мишка on 04.08.16.
 */
public class Split {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splitInput = input.split(" ");
        System.out.println(splitInput.length);
    }
}
