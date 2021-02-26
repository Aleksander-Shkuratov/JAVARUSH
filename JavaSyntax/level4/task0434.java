package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция

Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
*/

public class Solution {
    public static void main(String[] args) {
        int n = 1;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int j = 7;
        int k = 8;
        int l = 9;
        int m = 10;
        
        while(n<11){
            System.out.println(a*n+" "+b*n+" "+c*n+" "+d*n+" "+e*n+" "+f*n+" "+j*n+" "+k*n+" "+l*n+" "+m*n);
            n = n + 1;
        }
        //напишите тут ваш код
    }
}
