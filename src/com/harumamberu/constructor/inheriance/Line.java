package com.harumamberu.constructor.inheriance;

/**
 * Created by Мишка on 18.08.16.
 */
public class Line{
    Pixel pix1, pix2;
    public Line(int x1, int y1, int x2, int y2){
        pix1 = new Pixel(x1, y1);
        pix2 = new Pixel(x2, y2);
    }
}
