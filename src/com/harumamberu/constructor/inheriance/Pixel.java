package com.harumamberu.constructor.inheriance;

/**
 * Created by Мишка on 18.08.16.
 */
public class Pixel {
    private int x;
    private int y;

    public Pixel(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getCoordinates(){
        int[] res = {x, y};
        return res;
    }
}
