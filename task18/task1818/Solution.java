package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String fileName = bufferedReader.readLine();
    String fileName1 = bufferedReader.readLine();
    String fileName2 = bufferedReader.readLine();

    FileWriter fileWriter = new FileWriter(fileName);
    FileReader fileReader = new FileReader(fileName1);
    FileReader fileReader1 = new FileReader(fileName2);
    while (fileReader.ready()){
        fileWriter.write(fileReader.read());
    }
        while (fileReader1.ready()){
            fileWriter.write(fileReader1.read());
        }

        fileWriter.close();
        fileReader1.close();
        fileReader.close();
    }
}
