package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int spaceCount = 0;
        int total = 0;
        while (fileReader.ready()) {
            int readedChar = fileReader.read();
            total++;
            if (readedChar == (int) ' ') spaceCount++;
        }
            if (total != 0) {
                double result = (double) spaceCount / total * 100;
                System.out.printf("%.2f", result);
            }


        fileReader.close();
    }
}