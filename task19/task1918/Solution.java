package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws  IOException{
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader fileRedaer = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = fileRedaer.readLine()) != null){
            stringBuilder.append(line);
        }
        Document jsop = Jsoup.parse(stringBuilder.toString().replaceAll("[\\r\\n]", ""), "", Parser.xmlParser());
        Elements tegSearch = jsop.getElementsByTag(args[0]);
        for (Element element: tegSearch){
            System.out.println(element);
        }
        bufferedReader.close();
        fileRedaer.close();
    }
}
