package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String result = byteArrayOutputStream.toString();
        String words[] = result.split(" ");
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[2]);
        int c;
            if (words[1].trim().equals("+"))
                c = a + b;

       else if (words[1].trim().equals("-"))
            c = a - b;
       else
            c = a * b;

            System.out.println(a +  " "+words[1]+" "+b+" = "+c);

    }
    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

