package com.harumamberu.utils.runners;

import com.harumamberu.utils.convertors.PrimitiveConvertor;

/**
 * Created by Мишка on 12.07.16.
 */
public class PConvertorRunner {
    public static void main(String args[]) {
        PrimitiveConvertor pc_object1 = new PrimitiveConvertor();
        pc_object1.floatToChar();
        pc_object1.intToChar();
        pc_object1.charToInt();
    }
}
