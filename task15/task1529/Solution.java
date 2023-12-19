package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
            reset();

    }

    public static CanFly result;

    public static void reset() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String key = null;

            while (true) {
                key = reader.readLine();
                if (key.equals("plane")) {
                    result = new Plane(2);
                } else if (key.equals("helicopter")) {
                    result = new Helicopter();
                } else
                    break;

            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
