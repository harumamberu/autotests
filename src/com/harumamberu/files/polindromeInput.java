package com.harumamberu.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Мишка on 08.08.16.
 */
public class polindromeInput {
    public static void main(String[] args) throws IOException {
        BufferedReader readed = new BufferedReader(new FileReader("D:\\input.txt"));
        readed.close();
    }
}
