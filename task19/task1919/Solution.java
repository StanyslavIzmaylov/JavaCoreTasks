package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.Double.parseDouble;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        while (fileReader.ready()) {
            String[] words = fileReader.readLine().split(" ");
            String name = words[0];
            Double number = Double.parseDouble(words[1]);
            if (map.containsKey(name)) {
                double updateValue = number + map.get(name);
                map.put(name, updateValue);
                continue;
            }
            map.put(name, number);
        }
        for (Map.Entry<String, Double> str : map.entrySet()) {
            System.out.println(str.getKey() + " " + str.getValue());
        }
        fileReader.close();
        }
    }

