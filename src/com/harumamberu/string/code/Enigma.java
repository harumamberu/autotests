package com.harumamberu.string.code;

import java.util.Scanner;

/**
 * Created by Мишка on 04.08.16.
 */
public class Enigma {
    String original = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    String code = ("NOPQRSTUVWXYZABCDEFGHIJKLM");
    public String code(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder builder = new StringBuilder(input);
        for (int j =0; j<builder.length(); j++){
            for (int i=0; i<original.length(); i++){
                if (builder.charAt(j)==original.charAt(i)){
                    builder.setCharAt(i, original.charAt(i));
                }
            }
        }
        System.out.println(builder.toString());
        return input;
    }

    public static String decode(){

    }

    public static String cipler (String input, String orignal, String decode){

    }
}
