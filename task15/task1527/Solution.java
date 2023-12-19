package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int indexQ = url.indexOf('?');
        String subUrl = url.substring(indexQ + 1);
        String objParameter = null;
        double valueDouble = 0;
        int indexAmp = subUrl.indexOf('&');
        int indexEqu = subUrl.indexOf('=');
        while (indexEqu != -1 && indexAmp != -1) {
            if (indexEqu < indexAmp) {
                String parameter = subUrl.substring(0, indexEqu);
                System.out.print(parameter + " ");

                if (parameter.equals("obj")) {
                    String parameterValue = subUrl.substring(indexEqu + 1, indexAmp);
                    Scanner sc = new Scanner(parameterValue);
                    if (sc.hasNextDouble()) {
                        valueDouble = Double.parseDouble(parameterValue);
                    } else { // нет
                        objParameter = parameterValue;
                    }
                }

                subUrl = subUrl.substring(indexAmp + 1);
            } else {
                String parameter = subUrl.substring(0, indexAmp);
                System.out.print(parameter + " ");
                subUrl = subUrl.substring(indexAmp + 1);
                if (parameter.equals("obj")) {
                    objParameter = parameter;
                }
            }
            indexAmp = subUrl.indexOf('&');
            indexEqu = subUrl.indexOf('=');
        }
        String parameter = subUrl.substring(0, indexEqu); //
        System.out.println(parameter);

        if (objParameter != null) {
            alert(objParameter);
        }
        if (valueDouble != 0) {
            alert(valueDouble);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
