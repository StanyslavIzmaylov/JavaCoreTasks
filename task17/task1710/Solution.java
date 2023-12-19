package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
   static SimpleDateFormat formater = new SimpleDateFormat("dd/M/yyyy",Locale.ENGLISH);
    static SimpleDateFormat formater1 = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
    public static void main(String[] args) throws Exception {
        Date bithDay;
        Person person;
        if (args[0].equals("-c")){
            bithDay = formater.parse(args[3]);
            if (args[2].equals("м")){
            allPeople.add(Person.createMale(args[1],bithDay));}
            else {
                allPeople.add(Person.createFemale(args[1], bithDay));
            }
            System.out.println(allPeople.size()-1);
        }
        if (args[0].equals("-r")){
           person = allPeople.get(Integer.parseInt(args[1]));
           System.out.println(person.getName() +" " + (person.getSex() == Sex.MALE ? "м":"ж")+" " + formater1.format(person.getBirthDate()));
        }
        if (args[0].equals("-u")){
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(formater.parse(args[4]));
        }
        if (args[0].equals("-d")){
            int id = Integer.parseInt(args[1]);
            person = allPeople.get(id);
            person.setBirthDate(null);
            person.setSex(null);
            person.setName(null);
            allPeople.set(id,person);

        }
    }
}
