package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o.getClass().equals(Cat.class)) {
            System.out.println("Кошка");
        }
        if (o.getClass().equals(Dog.class)) {
            System.out.println("Собака");
        }
        if (o.getClass().equals(Bird.class)) {
            System.out.println("Птица");
        }
        if (o.getClass().equals(Lamp.class)) {
            System.out.println("Лампа");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
