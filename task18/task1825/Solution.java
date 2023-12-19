package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))) {
            Set<String> list = new TreeSet<>();
            String name = null;
            while (true) {
                String line = buf.readLine();
                if (line.equals("end")) break;
                name = line;
                list.add(line);
            }
            int index = name.lastIndexOf(".part");
            String file = name.substring(0, index);
            try (BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file, true))) {
                for (String str : list) {
                    try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(str))) {
                        while (reader.available() > 0) {
                            byte[] bytes = new byte[64000];
                            int i = reader.read(bytes);
                            writer.write(bytes, 0, i);
                        }
                    }
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
