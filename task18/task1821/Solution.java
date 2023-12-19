package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int[] asc = new int[128];
        while (fileInputStream.available() > 0) {
            int number = fileInputStream.read();
            for (int i = 0; i < asc.length; i++) {
                if (number == i) {
                    asc[i] = asc[i] + 1;
                }
            }
        }
        for (int i = 0; i < asc.length; i++) {
            if (asc[i] != 0){
                char result = (char) i;
                System.out.println(result + " " + asc[i]);
            }
        }
        fileInputStream.close();
    }
}