package com.harumamberu.string;

/**
 * Created by Мишка on 04.08.16.
 */
public class StringBuilderLection {


    public static void main(String[] args) {
        //stringPerformance();
        stringBuilderPerformance();
    }

/*    public static void stringPerformance(){
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i=0; i<1000L; i++){
            c = c.concat(b);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }*/

    public static void stringBuilderPerformance(){
        long start = System.currentTimeMillis();
        StringBuilder c = new StringBuilder("start");
        String b = "finish";
        for (long i=0; i<10L; i++){
            c = c.append(b);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }

}
