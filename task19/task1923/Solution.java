package com.javarush.task.task19.task1923;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName = args[0];
        String fileName1 = args[1];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        FileWriter fileWriter = new FileWriter(fileName1);
        while (fileReader.ready()){
            String str = fileReader.readLine();
            String[] words = str.split(" ");
            for (String word: words){
                Matcher matcher = Pattern.compile("\\d").matcher(word);
                if (matcher.find()) {
                    fileWriter.write(word + " ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }

}
