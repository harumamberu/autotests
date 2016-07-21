package com.harumamberu.utils.calculators;

/**
 * Created by Мишка on 18.07.16.
 */
public class InDecrements {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Original value is" + a);
        System.out.println("Post-increment a" + a++);
        System.out.println("After post-increment" + a);
        System.out.println("Pre-increment a" + --a);
        System.out.println("After pre-increment" + a);
    }
}
