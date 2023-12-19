package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = 0;
        while (fileInputStream.available() > 0) {
            int ch =  fileInputStream.read();

            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                count++;
            }

        }
        System.out.println(count);
        fileInputStream.close();
    }
}