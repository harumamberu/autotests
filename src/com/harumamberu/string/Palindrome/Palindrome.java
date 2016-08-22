package com.harumamberu.string.Palindrome;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        int l;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] ch = word.toCharArray();
        l = word.length();
        int flag = 0;
        for (int i = 0; i < l/2; i++){
            if (ch[i]==ch[l - i - 1]) {
                System.out.println(ch[i] + " = " + ch[l - i - 1]);
                flag++;
            }else{
                flag = 0;
                System.out.println("not palindrome");
            }
            if (flag == l/2){
                System.out.println("Is palindrome");
            }
        }

    }
}
