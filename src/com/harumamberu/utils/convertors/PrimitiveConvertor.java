package com.harumamberu.utils.convertors;

public class PrimitiveConvertor {
    float floatPC = 69.854f;
    int intPC = 1;
    char charPC = 1;
    int i = 10;
    double d= 10.1;
    long l = 11;
    boolean b = true;

    public void primitiveToString(){
        String exmpl = String.valueOf(i);
        i = Integer.valueOf(exmpl);

        exmpl = String.valueOf(d);
        d = Double.valueOf(exmpl);

        exmpl = String.valueOf(l);
        l = Long.valueOf(exmpl);

        exmpl = String.valueOf(b);
        System.out.println(exmpl);
        b = Boolean.valueOf(exmpl);
        System.out.println(b);

    }

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
