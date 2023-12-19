package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    int getCountOfEggsPerMonth() {
        return 20;
    }
}
