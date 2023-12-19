package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        while (fileReader.ready()) {
            String number = fileReader.readLine();
            String words[] = number.split(" ");
            for (String temp : words) {
                try {
                    int num = Integer.parseInt(temp);
                    fileWriter.write(num+" ");
                } catch (NumberFormatException nfe) {
                }
            }
            bufferedReader.close();
            fileWriter.close();
            fileReader.close();
        }

    }
}