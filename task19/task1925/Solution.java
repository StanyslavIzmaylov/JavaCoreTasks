package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String fileName1 = args[1];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        FileWriter fileWriter = new FileWriter(fileName1);
        List<String> stringToFile = new ArrayList<>();
        String input;
        while ((input = fileReader.readLine()) !=null) {
            stringToFile.add(input);
        }
            StringBuilder stringBuilder = new StringBuilder();
            for (String line : stringToFile) {
                String[] words = line.split(" ");
                for (String word:words )
                if (word.length() > 6){
                   stringBuilder.append(word).append(" ");
            }
                }
            String resultLine = stringBuilder.toString().trim().replaceAll(" ", ",");
           fileWriter.write(resultLine);

            fileReader.close();
            fileWriter.close();


    }
}