package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
 static {
     threads.add(new Thread1());
     threads.add(new Thread2());
     threads.add(new Thread3());
     threads.add(new Thread4());
     threads.add(new Thread5());
 }
    public static void main(String[] args) {

}
 static class Thread1 extends Thread{
      public void run(){
          while (true){
          }
      }
}
    static class Thread2 extends Thread{
     public void run(){
         System.out.println("InterruptedException");
     }
    }
    static class Thread3 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    static class Thread4 extends Thread implements Message {
        public void run() {
            while (!isInterrupted()) {
            }
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    static class Thread5 extends Thread {

        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true){
                try {
                    String str = bufferedReader.readLine();
                    if (str.equals("N")) break;
                    sum += Integer.parseInt(str);
                } catch (IOException e) {
                  e.printStackTrace();
                }

            }
            System.out.println(sum);
        }
    }
}