package com.javarush.task.task18.task1819;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     String fileName = bufferedReader.readLine();
     String fileName1 = bufferedReader.readLine();
     FileReader fileReader = new FileReader(fileName);
     ArrayList<Integer> file1 = new ArrayList<>();
     ArrayList<Integer> file2 = new ArrayList<>();
     while (fileReader.ready()) {
         file1.add(fileReader.read());
     }
     FileWriter fileWriter = new FileWriter(fileName);
     FileReader fileReader1 = new FileReader(fileName1);
        while (fileReader1.ready()) {
            file2.add(fileReader1.read());
        }
     for (Integer tenp: file1){
         file2.add(tenp);
     }
     for (Integer integer: file2){
         fileWriter.write(integer);
     }
     fileReader.close();
     fileReader1.close();
     fileWriter.close();
    }
}
