package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws  IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readStart;
        while (!(readStart = bufferedReader.readLine()).equals("exit")) {
            new ReadThread(readStart).start();
        }
    }
    public static class ReadThread extends Thread {
    private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {

            byte[] byteCount = new byte[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)){
                while (fileInputStream.available()>0) {
                    int oneByte = fileInputStream.read();
                    byteCount[oneByte]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
                int maxCount = 0;
                int maxCountByte = 0;
                for (int i = 0; i < byteCount.length; i++) {
                    if (byteCount[i] > maxCount) {
                        maxCount = byteCount[i];
                        maxCountByte = i;
                    }
                }
                resultMap.put(fileName, maxCountByte);






        }
    }
}
