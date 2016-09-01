package com.harumamberu.string.code;

import java.util.Scanner;


public class Enigma {
    static String originalT = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    static String encodeT = ("NOPQRSTUVWXYZABCDEFGHIJKLM");
    public static void code(String toEncode){
        Enigma.cipler(toEncode, originalT, encodeT);
    }

    public static void decode(String toDecode){
        Enigma.cipler(toDecode, encodeT, originalT);
    }

    public static String cipler(String input, String stringFrom, String stringTo){
        StringBuilder builder = new StringBuilder(input);
        for (int j =0; j<builder.length(); j++){
            for (int i = 0; i< stringTo.length(); i++){
                if (builder.charAt(j) == stringFrom.charAt(i)){
                    builder.setCharAt(j, stringTo.charAt(i));
                    break;
                }
            }
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
    public void enigmaMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to code:");
        Enigma.code(scanner.nextLine().toUpperCase());
        System.out.println("Enter word to decode:");
        Enigma.decode(scanner.nextLine().toUpperCase());
    }
}
