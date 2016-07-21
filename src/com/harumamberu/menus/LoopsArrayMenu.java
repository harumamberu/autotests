package com.harumamberu.menus;

/**
 * Created by Мишка on 19.07.16.
 */
public class LoopsArrayMenu {
    public void Arrays() {
        int[] EvenArray = new int[10];
        int k = 2;
        for ( int i = 0; ( i > -1 ) && ( i < 10); i++){
            EvenArray[i] = k;
            k+=2;
        }
        for ( int i : EvenArray ){
            System.out.print(" " + i);
        }
        for ( int i : EvenArray ){
            System.out.print("\n" + i);
        }
    }
}
