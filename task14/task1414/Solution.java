package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String key = null;
        Movie movie;
       while (true){
           key = scanner.nextLine();
           if (key.equals("cartoon")){
               movie = MovieFactory.getMovie(key);
               System.out.println(movie.getClass().getSimpleName());
           }
          else if (key.equals("thriller")){
               movie = MovieFactory.getMovie(key);
               System.out.println(movie.getClass().getSimpleName());
           }
           else if (key.equals("soapOpera")){
               movie = MovieFactory.getMovie(key);
               System.out.println(movie.getClass().getSimpleName());
           }
           else {
               MovieFactory.getMovie(key);
               break;
           }



       }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie{
    }

}
