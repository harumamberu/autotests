package com.harumamberu.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Мишка on 08.08.16.
 */
public class bufferedReaderLection {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\input.txt"));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                i++;
            }
            System.out.println(i);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }
}
