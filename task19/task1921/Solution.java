package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        while (bufferedReader.ready()) {
            String fullLine = bufferedReader.readLine();
            String name = fullLine.replaceAll("[^а-яА-Я -]", "");
            String date = fullLine.replaceAll("[^0-9 ]", "");
            PEOPLE.add(new Person(name.trim(), formatter.parse(date.trim())));
        }
        bufferedReader.close();
        }

    }

