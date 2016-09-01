package com.harumamberu.utils.runners;

import com.harumamberu.utils.convertors.PrimitiveConvertor;

public class HW3primitiveConvertor {
    public static void main(String args[]) {
        PrimitiveConvertor pc_object1 = new PrimitiveConvertor();
        pc_object1.floatToChar();
        pc_object1.intToChar();
        pc_object1.charToInt();
        pc_object1.primitiveToString();
    }
}
