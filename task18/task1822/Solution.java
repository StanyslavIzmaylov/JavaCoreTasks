package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        while (fileReader.ready()){
            String line = fileReader.readLine();
            String[] words = line.split(" ");
                if (words[0].equals(args[0]))
                    System.out.println(line);

            }
        bufferedReader.close();
        fileReader.close();
    }
}
