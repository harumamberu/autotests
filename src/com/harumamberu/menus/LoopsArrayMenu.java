package com.harumamberu.menus;

import com.harumamberu.arrays.loops.*;

import java.util.Scanner;

/**
 * Created by Мишка on 19.07.16.
 */
public class LoopsArrayMenu {
//////////////////////////////////////////////////////////
    public void loopArrayMenu() {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        switch (i){
            case "a": AevenArray0to20.evenArray0to20();
                break;
            case "b": BoddArray1to99.oddArray1to99();
                break;
            case "c": CarrayRandom15.arrayRandom15();
                break;
            case "d": Darray0to999.dArray0to999();
                break;
            case "g": Garray8x5.gArray8x5();
                break;
            case "e": Earray8x5.eArr8x5();
                default:
        }
    }
//////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////

}

