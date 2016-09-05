package com.harumamberu.arrays;

import java.util.Arrays;

public class ArraySorterGenerics<T extends Number> {
    T[] t;

    public static void main(String[] args) {
        /*Integer[] arr = new Integer[];
        new ArraySorterGenerics<Integer>();*/
    }

    public ArraySorterGenerics(T[] t){
        this.t = t;
    }

    public void sortArrGeneric(){
        this.t = sortArrGeneric(t);
    }

    public static <T extends Number> T[] sortArrGeneric(T[] t){
        Arrays.sort(t);
        return t;
    }

}
