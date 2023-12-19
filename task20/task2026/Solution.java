package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0, tmp = -1, jt = a[0].length;
        boolean findRect = false;
        while (tmp != count) { //если счётчик увеличился за проход по матрице - снова делаем проход по матрице
            tmp = count;

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (a[i][j] == 1 && !findRect) { //случай, когда встретили прямоугольник
                        count++;
                        jt = j; //запоминаем столбец, в котором начался прямоугольник
                        findRect = true;
                        a[i][j] = 0;
                    }
                    else if (a[i][j] == 1 && findRect) {//обнуляем, чтобы не мешался
                        a[i][j] = 0;
                    }
                    else if (a[i][j] == 0 && findRect && j == jt) { //если элемент под прямоугольник равен 0 - он закончился
                        break; //выходим из внешнего цикла
                    }
                    else if (a[i][j] == 0 && findRect && j > jt) { //если элемент справа от прямоугольника равен 0 - идем на след строку
                        break;
                    }
                }
            }
            findRect = false;
        }
        return count;
    }
}
