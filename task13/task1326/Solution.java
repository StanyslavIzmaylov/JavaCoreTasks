package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String road = scanner.next();
        FileInputStream fileInputStream = new FileInputStream(road);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        String sNumber;
        while ((sNumber = bufferedReader.readLine()) != null){
            int number = Integer.parseInt(sNumber);
            if (number % 2 == 0){numbersList.add(number);}
        }

        Collections.sort(numbersList);
        for (int i:numbersList){System.out.println(i);}

        fileInputStream.close();
        bufferedReader.close();
        scanner.close();

    }
}
