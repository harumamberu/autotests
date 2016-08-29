package com.harumamberu.string;

import java.util.Scanner;

public class Builder9b {
    public void splitString() {
        StringBuilder out = new StringBuilder();
        StringBuilder alphabet = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
        System.out.println("Enter array data separated by ';'");
        String[] dataArray = new String(new Scanner(System.in).nextLine()).split(";");
        for( int i = 0; i < dataArray.length; i++){
            for( int chars = 0; chars < dataArray[i].length(); chars++){
                for( int j = 0; j < alphabet.length(); j++) {
                    if (dataArray[i].charAt(chars) == alphabet.charAt(j)) {
                        out.append(dataArray[i]+" ");
                    }
                }
            }
        }
        System.out.println(out);
    }
}
