package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Statics.FILE_NAME));

        while (( line = bufferedReader.readLine()) != null){
            lines.add(line);
        }

    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


        public static void main(String[] args) {
        System.out.println(lines);
    }
}
