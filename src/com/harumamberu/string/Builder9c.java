package com.harumamberu.string;


import java.util.Scanner;

public class Builder9c {
    public void keyWord() {
        System.out.println("Enter string:");
        String input = new Scanner(System.in).nextLine();
        System.out.println("Enter key-word:");
        String keyword = new Scanner(System.in).nextLine();
        String[] output = input.split(keyword);
        for(String i : output){
            System.out.println(i);
        }
    }
}
