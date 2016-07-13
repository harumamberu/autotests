package com.harumamberu.utils.convertors;

public class PrimitiveConvertor {
    float floatPC = 69f;
    int intPC = 69;
    char charPC = 0;

    public void floatToChar() {
        charPC = (char) floatPC;
        System.out.println("Input float values is " + floatPC + ". Output char value is " + charPC);
    }

    public void intToChar() {
        charPC = (char) intPC;
        System.out.println("Input int values is " + intPC + ". Output char value is " + charPC);
    }

    public void charToInt() {
        intPC = (int) charPC;
        System.out.println("Input char values is " + charPC + ". Output int value is " + intPC);
    }
}
