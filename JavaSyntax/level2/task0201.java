package com.javarush.task.task02.task0201;

/* 
Реализуем метод print

Допиши код в методе print, 
чтобы он выводил на экран каждую переданную
в него строку 4 раза. 
Каждый раз с новой строки.
*/
public class Solution {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        //напишите тут ваш код
    }
}
