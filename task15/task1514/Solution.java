package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.2,"мир");
        labels.put(1.7,"пир");
        labels.put(1.9,"вир");
        labels.put(2.9,"война");
        labels.put(2.94,"конец");
    }


    public static void main(String[] args) {

        System.out.println(labels);
    }
}
