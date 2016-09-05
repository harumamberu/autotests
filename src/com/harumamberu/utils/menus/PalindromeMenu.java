package com.harumamberu.utils.menus;

import com.harumamberu.string.Palindrome;

import java.util.Scanner;


public class PalindromeMenu {
    public void palindromeMenu(){
        Palindrome palindromeRef = new Palindrome();
        boolean stop = false;
        do{
            try{
                System.out.println("\nEnter the symbols A, B, C, D, E to choose algorithm(enter S to stop):");
                Tasks switcher = Tasks.valueOf(new Scanner(System.in)
                        .nextLine().toUpperCase());

                switch (switcher){
                    case A: palindromeRef.algorithm1(); break;
                    case B: palindromeRef.algorithm2(); break;
                    case C: palindromeRef.algorithm3(); break;
                    case D: palindromeRef.algorithm4(); break;
                    case E: palindromeRef.algorithm5(); break;
                    case S: stop = true;
                    default:System.out.println("Wrong input. Try again.");
                }

            }catch (IllegalArgumentException e){
                System.out.println("Wrong input. Try again.");
            }

        }while(stop==false);
    }
}
