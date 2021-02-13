package com.javarush.task.task01.task0129;

/* 
Считаем длину окружности

Выведи на экран длину окружности, рассчитанную по формуле:
L = 2 * Pi * radius (в методе printCircleLength).
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.
*/

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double Pi=3.14;
        System.out.println(2*Pi*radius);
        //напишите тут ваш код
    }
}
