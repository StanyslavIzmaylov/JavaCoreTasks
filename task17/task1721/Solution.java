package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName));
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileName2));
            String line;
            String line2;
            while ((line = bufferedReader1.readLine()) != null) {
                allLines.add(line);
            }
            while ((line2 = bufferedReader2.readLine()) != null) {
                forRemoveLines.add(line2);
            }
            new Solution().joinData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
