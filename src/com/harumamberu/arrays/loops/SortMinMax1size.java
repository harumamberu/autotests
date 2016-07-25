package com.harumamberu.arrays.loops;

/**
 * Created by Михаїл on 25.07.2016.
 */
public class SortMinMax1size {
    int sort, flag;
    public int[] sortMinToMax (int[] arrIn){
        flag = 0;
        int[] arrOut = arrIn;

        do{
            for(int i = 0; i < (arrIn.length - 1) ; i++){
                if (arrIn[i] > arrIn[i+1]) {
                    sort = arrIn[i+1];
                    arrIn[i+1] = arrIn[i];
                    arrIn[i] = sort;
                    flag++;
                }
            }
        }while(flag!=0);
        return arrOut;
    }
/////////////////////////////////////////
    public int[] sortMaxToMin (int[] arrIn){
        flag = 0;
        int[] arrOut = arrIn;

        do{
            for(int i = 0; i < (arrIn.length - 1) ; i++){
                if (arrIn[i] < arrIn[i+1]) {
                    sort = arrIn[i+1];
                    arrIn[i+1] = arrIn[i];
                    arrIn[i] = sort;
                    flag++;
                }
            }
        }while(flag!=0);

    return arrOut;
}
}
