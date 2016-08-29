package com.harumamberu.string;

import com.harumamberu.arrays.ArrayPrint;
import com.harumamberu.arrays.SortsArray;

import java.util.Scanner;

/**
 * Created by Мишка on 04.08.16.
 */
public class Builder9a {
    public void splitAndSort(){
        System.out.println("Enter data array separated by ';'");
        String[] splitInput = new String(new Scanner(System.in).nextLine()).split(";");
        System.out.println("Enter 1 or 2 to sort from Min to Max or from Max to Min");
        switch (new Scanner(System.in).nextLine()){
            case "1":
                new SortsArray().selectionSortMin2Max(splitInput);
                break;
            case "2":
                new SortsArray().selectionSortMax2Min(splitInput);
                break;
        }
        new ArrayPrint().arrayPrintOut(splitInput);
    }
}
