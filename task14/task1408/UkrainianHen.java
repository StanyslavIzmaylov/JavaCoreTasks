package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    int getCountOfEggsPerMonth() {
        return 10;
    }
}
