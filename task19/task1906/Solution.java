package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        String fileName1 = bufferedReader.readLine();
        FileReader fileReader = new FileReader(fileName);
        FileWriter fileWriter = new FileWriter(fileName1);
        int count = 0;
        while (fileReader.ready()){
            int data = fileReader.read();
            if (++count%2 == 0){
                fileWriter.write(data);
            }


        }
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
