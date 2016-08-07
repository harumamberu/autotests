package com.harumamberu.arrays;

/**
 * Created by Михаїл on 25.07.2016.
 */
public class SortsArray {

    public static int[][] sortMinToMax (int[][] arrIn){
        int sort;
        boolean flag;
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
    public static int[][] sortMaxToMin (int[][] arrIn){
        int sort;
        boolean flag;
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

    public static int maxValue (int[][] arrIn){
        int[][] arrOut = arrIn;
        int j =0;
        int i =0;
        int maxV = arrOut[j][i];

        for(j = 0; j<arrOut.length; j++){
            for(i = 0; i<arrOut[j].length; i++){
                 if(arrOut[j][i]>maxV){
                    maxV=arrOut[j][i];
                }
            }
        }
     return maxV;
    }

/////////////////////////////////////////

    public static int minValue (int[][] arrIn){
        int[][] arrOut = arrIn;
        int j =0;
        int i =0;
        int minV = arrOut[j][i];

        for(j = 0; j<arrOut.length; j++){
            for(i = 0; i<arrOut[j].length; i++){
                if(arrOut[j][i]<minV){
                    minV=arrOut[j][i];
                }
            }
        }
        return minV;
    }
///////////////////////////////////////////////////////////
    public static int[][] selectionSortMin2Max (int[][] arrIn){
        int[][] arrOut = arrIn;
        int maxI, maxJ, sort, jump;
        boolean flag;
        do {flag = true;
            for (int i = 0; i < arrOut.length; i++) {
                for (int j = 0; j < arrOut[i].length; j++) {
                    maxI = i;
                    maxJ = j;
                    jump = j;
                    for (int m = i; m < arrOut.length; m++) {
                        for (int n = jump; n < arrOut[0].length; n++) { //find smallest value
                            if (arrOut[m][n] > arrOut[maxI][maxJ]) {    //find smallest value
                                maxI = m;
                                maxJ = n;
                            }
                            if (n == arrOut[0].length - 1){ //jump to the start of the next subarray arrOut[i][0]
                                jump = 0;
                            }
                        }
                    }
                    sort = arrOut[i][j];
                    arrOut[i][j] = arrOut[maxI][maxJ];
                    arrOut[maxI][maxJ] = sort;
                    flag = false;
                }
            }
        }while(flag=false);



        return arrOut;
    }
}
