package com.javarush.task.task03.task0311;

/* 
Печатаем строки

Реализуй метод public static void writeToConsole(String s),
который добавляет к началу строки выражение "printing: " 
и выводит измененную строку на экран.
*/

public class Solution {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        System.out.println("printing: "+s);
        //напишите тут ваш код

    }
}
