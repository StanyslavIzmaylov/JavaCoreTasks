package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        List<Integer> temp = new ArrayList<>();
        while (fileInputStream.available() > 0){
        temp.add(fileInputStream.read());
        }
        Collections.reverse(temp);
        for(Integer temps:temp){
            fileOutputStream.write(temps);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
