package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while (fileReader.ready()){
            String str = fileReader.readLine();
            String[] line = str.split("[^\\w]");

            for(String word: line)
                if(word.equals("world"))
                    count++;
                }

            System.out.println(count);
        fileReader.close();
        }

    }

