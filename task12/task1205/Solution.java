package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o.getClass().equals(Cow.class)) {
           return "Корова";
        }
        else if (o.getClass().equals(Whale.class)) {
            return "Кит";
        }
        else if (o.getClass().equals(Dog.class)) {
           return "Собака";
        }

    else

        return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
