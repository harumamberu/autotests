package com.harumamberu.string;

import java.util.Arrays;
import java.util.Scanner;


public class Palindrome {
    Scanner sc = new Scanner(System.in);
    String word;
    int l;
    char[] charArray, h1, h2;


    public void setWord(String word){
        this.word = word;
        this.l = word.length();
    }
    public void setCharArray() {
        System.out.println("Enter word:");
        setWord(sc.nextLine().toLowerCase());
        charArray = word.toCharArray();
    }
    public void printPalindrome(boolean check){
        if(check==true){
            System.out.println(word + " is palindrome");
        } else {System.out.println(word + " is not palindrome");}
    }

    public void algorithm1() {
        setCharArray();
        int flag = 0;
        for (int i = 0; i < l/2; i++){
            if (charArray[i]==charArray[l - i - 1]) {
                System.out.println(charArray[i] + " = " + charArray[l - i - 1]);
                flag++;
            }else{
                flag = 0;
                printPalindrome(false);
            }
            if (flag == l/2){
                printPalindrome(true);
            }
        }
    }

    public void algorithm2() {
        setCharArray();
        String word2 = new StringBuilder(word).reverse().toString();
        if(word.equals(word2)){
            printPalindrome(true);
        }else {printPalindrome(false);}
    }

    public void algorithm3() {
        setCharArray();
        h1 = new char[l/2];
        h2 = new char[l/2];
        for (int i = 0; i < l/2; i++){
            h1[i] = charArray[i];
            h2[i] = charArray[l - i - 1];
        }
        if(Arrays.equals(h1, h2)){
            printPalindrome(true);
        }else{printPalindrome(false);}
    }

    public void algorithm4() {
        setCharArray();
        h1 = new char[l/2];
        h2 = new char[l/2];
        String word2 = new StringBuilder(word).reverse().toString();
        for(int i = 0; i < l/2; i++){
            h1[i] = word.charAt(i);
            h2[i] = word2.charAt(i);
        }
        if(Arrays.equals(h1, h2)){
            printPalindrome(true);
        }else{printPalindrome(false);}
    }

    public void algorithm5() {
        int p = 0;
        setCharArray();
        h1 = new char[l];
        for(int i = 0; i < l; i++){
            h1[i] = word.charAt(l - 1 - i);
        }
        for(int i = 0; i < l; i++){
            if(h1[i]==word.charAt(i)){
                p++;
            }
        }
        if(p == l){
            printPalindrome(true);
        } else{printPalindrome(false);}

    }
}
