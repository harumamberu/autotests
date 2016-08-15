package com.harumamberu.menus;

import com.harumamberu.string.code.Enigma;

import java.util.Scanner;

/**
 * Created by Мишка on 04.08.16.
 */
public class CodeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose action:");
        String switchP = sc.nextLine();
        String input;
        switch(switchP) {
            case "c":
                input = sc.nextLine();
                Enigma.code(input);
                break;
            case "d":
                input = sc.nextLine();
                Enigma.decode(input);
                break;
                default: System.out.println("Wrong input."); break;
        }
    }
}
