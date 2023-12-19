package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);
        FileOutputStream outputStream3 = new FileOutputStream(fileName3);
        byte[] buffer = new byte[1000];

        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read(buffer);
            int middle = count % 2 == 0 ? count / 2 : count / 2 + 1;
            if (buffer.length % 2 == 0)
                outputStream2.write(buffer, 0, middle);
                outputStream3.write(buffer, middle,count-middle);
        }
        bufferedReader.close();
        fileInputStream.close();
        outputStream3.close();
        outputStream2.close();
    }
}
