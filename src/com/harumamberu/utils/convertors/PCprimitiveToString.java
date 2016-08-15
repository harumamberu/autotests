package com.harumamberu.utils.convertors;

/**
 * Created by Мишка on 25.07.16.
 */
public class PCprimitiveToString {
    public static void main(String[] args) {
        int i = 10;
        double d= 10.1;
        long l = 11;
        boolean b = true;
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
}
