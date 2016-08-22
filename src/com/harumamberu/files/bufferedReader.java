package com.harumamberu.files;

import com.harumamberu.arrays.SortsArray;

import java.io.*;

/**
 * Created by Мишка on 09.08.16.
 */
public class bufferedReader {
    public static void main(String[] args) {
        try {
            bufferedReader.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String[] readFile() throws IOException {
        BufferedReader readedF = new BufferedReader( new FileReader("D:\\input.txt"));
        int linesN = 0;
        String line4length;
        while((line4length = readedF.readLine()) != null) {
            linesN++;
        }

        String fileOfLines[] = new String[linesN];
        for ( int i = 0; readedF.readLine() != null; i++) {
            fileOfLines[i] = readedF.readLine();
        }

        readedF.close();
        return fileOfLines;
    }

    public static BufferedWriter writeToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\output.txt")));

//        BufferedReader readedF = new BufferedReader( new FileReader(pathFile));
//        String line;
        return writer;
    }

    public static void sortFile(String[] file, BufferedWriter writer) throws IOException {
        int sortP;
        String[][] sortLine = new String[file.length][];
        int[][] sortLineInt = new int[file.length][];
        for( int q = 0; q < file.length; q++) {
            sortLine[q] = file[q].split(",");
        }

        for( int q = 0; q < file.length; q++){
            for( int i = 0; i < file[q].length(); i++){
                sortLineInt[q][i] = Integer.valueOf(sortLine[q][i]);
            }
        }

        for( int q = 0; q < file.length - 1; q++) {
/*            for (int i = 0; i < sortLine.length - 1; i++) {
                if (Integer.valueOf(sortLine[q][i]) > Integer.valueOf(sortLine[q][i + 1])) {
                    sortP = Integer.valueOf(sortLine[q][i]);
                    sortLine[q][i] = sortLine[q][i+1];
                    sortLine[q][i + 1] = String.valueOf(sortP);
                }
            }
            */
            int[] sorted = SortsArray.selectionSortMax2MinArr(sortLineInt[q]);
            writer.append("" + sorted[q]);
            writer.newLine();
        }


        for (String[] s : sortLine) {

        }


 /*       int lengthArr = 0;
        String lineForLength;
        while ((lineForLength = reader.readLine()) != null){
            lengthArr++;
        }
        String line[] = new String[lengthArr];
        for (int j = 0; reader.readLine() != null; j++) {
            line[j] = reader.readLine();*/

    }
}
