package com.javarush.task.task02.task0219;

/* 
Печатаем трижды

Реализуй метод print3. 
Метод должен вывести переданную строку (слово)
на экран три раза через пробел.
*/
public class Solution {
    public static void print3(String s) {
        System.out.println(s+" "+s+" "+s);
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
