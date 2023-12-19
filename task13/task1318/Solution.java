package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
      String road = scanner.next();
      FileInputStream fileInputStream = new FileInputStream(road);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        fileInputStream.close();
        bufferedReader.close();
        scanner.close();
    }
}