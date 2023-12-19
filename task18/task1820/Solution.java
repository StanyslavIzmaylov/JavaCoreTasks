package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        PrintWriter fileWriter = new PrintWriter(new FileWriter(file2));
        while (fileReader.ready()) {
            String[] strings = fileReader.readLine().split(" ");
            for (String str : strings){
                double number = Double.parseDouble(str);
                long roundNumber = Math.round(number);
                fileWriter.write(roundNumber+" ");
            }
        
        }
        fileReader.close();
        fileWriter.close();

    }
}
