package com.harumamberu.files;

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
    public static BufferedReader readFile() throws IOException {
        BufferedReader readedF = new BufferedReader( new FileReader("D:\\input.txt"));
      /*String line[];
        for ( int i = 0; line[i] != null; i++) {
            line[i] = readedF.readLine();
        }
        readedF.close();*/
        return readedF;
    }

    public static BufferedWriter writeToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\output.txt")));
//        BufferedReader readedF = new BufferedReader( new FileReader(pathFile));
//        String line;
        return writer;
    }

    public static void sortFile(BufferedReader reader, BufferedWriter writer) throws IOException {
        String line;
        int sortP;
        String[] sortLine;
        while((line = reader.readLine()) != null) {
            sortLine = line.split(",");
            for (int i = 0; i < sortLine.length - 1; i++) {
                if (Integer.valueOf(sortLine[i]) > Integer.valueOf(sortLine[i + 1])) {
                    sortP = Integer.valueOf(sortLine[i]);
                    sortLine[i] = sortLine[i+1];
                    sortLine[i + 1] = String.valueOf(sortP);
                }
            }
        }
        for (String s : sortLine) {

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
