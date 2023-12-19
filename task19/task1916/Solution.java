package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        BufferedReader filereader1 = new BufferedReader(new FileReader(file1));
        BufferedReader filereader2 = new BufferedReader(new FileReader(file2));
        List<String> fileLine1 = new ArrayList<>();
        List<String> fileLine2 = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;

        while (filereader1.ready()) {
            String line1 = filereader1.readLine();
            fileLine1.add(line1);
            }
        while (filereader2.ready()) {
            String line2 = filereader2.readLine();
            fileLine2.add(line2);
        }
        while ((count1 < fileLine1.size()) && (count2 < fileLine2.size())){
            if (fileLine1.get(count1).equals(fileLine2.get(count2))){
                lines.add(new LineItem(Type.SAME,fileLine1.get(count1)));
                count1++;
                count2++;
            }
            else if ((count2+1 < fileLine2.size()) && (fileLine1.get(count1).equals(fileLine2.get(count2+1)))){
                lines.add(new LineItem(Type.ADDED,fileLine2.get(count2)));
                count2++;
        }
            else if ((count1+1 < fileLine1.size()) && (fileLine1.get(count1+1).equals(fileLine2.get(count2)))){
                lines.add(new LineItem(Type.REMOVED,fileLine1.get(count1)));
                count1++;
            }
        }
        while (count1 < (fileLine1.size())){
            lines.add(new LineItem(Type.REMOVED,fileLine1.get(count1)));
            count1++;
        }
        while (count2<(fileLine2.size())){
            lines.add(new LineItem(Type.ADDED,fileLine2.get(count2)));
            count2++;
        }
        bufferedReader.close();
        filereader1.close();
        filereader2.close();
        }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
