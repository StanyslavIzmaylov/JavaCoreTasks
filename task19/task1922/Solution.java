package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()) {
            String stringLine = fileReader.readLine();
            String[] strings = stringLine.split(" ");
            int count = 0;
            for (String str : strings) {
                if (words.contains(str)) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println(stringLine);
        }
        bufferedReader.close();
        fileReader.close();
    }
}