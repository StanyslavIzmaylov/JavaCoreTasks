package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws  IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()) {
           String line = fileReader.readLine();
           System.out.println(new StringBuilder(line).reverse().toString());


        }
        bufferedReader.close();
        fileReader.close();

    }
}
