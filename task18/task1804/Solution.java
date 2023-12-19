package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        byte [] bytes = new byte[256];
        byte byteHigh;
        while (fileInputStream.available()>0){
            byteHigh = (byte) fileInputStream.read();
            bytes [byteHigh] +=1;
        }
        int min =0;
        for (int counterOfByte : bytes)
            if (counterOfByte != 0 && (min == 0 || counterOfByte < min)) min = counterOfByte;
        for (int i = 0; i < bytes.length; i++)
            if (bytes[i] == min) System.out.print((byte) i + " ");


        fileInputStream.close();
    }
}
