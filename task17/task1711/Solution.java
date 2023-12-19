package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat formater1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {

        Date bithDay;

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3) {
                       Person person = args[i + 1].equals("м") ? Person.createMale(args[i], formater.parse(args[i + 2])) : Person.createFemale(args[i], formater.parse(args[i + 2]));
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
            break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
                        allPeople.get(Integer.parseInt(args[i])).setSex(args[i+2].equals("м") ? Sex.MALE: Sex.FEMALE);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(formater.parse(args[i+3]));

                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    }
                    }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                       Person person = allPeople.get(Integer.parseInt(args[i]));
                        System.out.println(person.getName() +" " + (person.getSex() == Sex.MALE ? "м":"ж")+" " + formater1.format(person.getBirthDate()));                    }
                }
                break;
        }
        }
    }
