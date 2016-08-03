package com.harumamberu.arrays;

/**
 * Created by Михаїл on 25.07.2016.
 */
public class PeckOfSortsArray {
    int sort;
    boolean flag;
    public int[][] sortMinToMax (int[][] arrIn){
        int[][] arrOut = arrIn;

        do{
            flag  = true;
            for(int j = 0; j < (arrOut.length ) ; j++){
                for(int i = 0; i < (arrOut[j].length)-1 ; i++){
                    if ( i == (arrOut[j].length -1 -1) && j < (arrOut.length - 1)){
                        if (arrOut[j][i+1] > arrOut[j+1][0]){
                            sort = arrOut[j+1][0];
                            arrOut[j+1][0] = arrOut[j][i+1];
                            arrOut[j][i+1] = sort;
                            flag = false;
                        }

                    }
                    if (arrOut[j][i] > arrOut[j][i+1]) {
                        sort = arrOut[j][i + 1];
                        arrOut[j][i + 1] = arrOut[j][i];
                        arrOut[j][i] = sort;
                        flag = false;
                    }

                }
            }
        }while(flag==false);
        return arrOut;
    }
/////////////////////////////////////////
    public int[][] sortMaxToMin (int[][] arrIn){
        int[][] arrOut = arrIn;
        do{
            flag  = true;
            for(int j = 0; j < (arrOut.length ) ; j++){
                for(int i = 0; i < (arrOut[j].length)-1 ; i++){
                    if ( i == (arrOut[j].length -1 -1) && j < (arrOut.length - 1)){
                        if (arrOut[j][i+1] < arrOut[j+1][0]){
                            sort = arrOut[j+1][0];
                            arrOut[j+1][0] = arrOut[j][i+1];
                            arrOut[j][i+1] = sort;
                            flag = false;
                        }

                    }
                    if (arrOut[j][i] < arrOut[j][i+1]) {
                        sort = arrOut[j][i + 1];
                        arrOut[j][i + 1] = arrOut[j][i];
                        arrOut[j][i] = sort;
                        flag = false;
                    }
                }
            }
        }while(flag==false);
    return arrOut;
    }

/////////////////////////////////////////

}
