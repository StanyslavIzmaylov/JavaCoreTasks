package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String road = scanner.nextLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writter = new BufferedWriter(new FileWriter(road));
        String line;
        while (!(line = reader.readLine()).equals("exit")) {
            writter.write(line+ "\n");
        }
        writter.write("exit");
        reader.close();
        writter.close();
        scanner.close();
    }
}
