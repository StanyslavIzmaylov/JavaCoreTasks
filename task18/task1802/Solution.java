package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        int min = fileInputStream.read();
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if(data < min) {
                min = data;
            }
        }
        fileInputStream.close();
        System.out.println(min);
    }
}
