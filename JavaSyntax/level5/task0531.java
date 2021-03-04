package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность

Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {

        int f = a;

        if(a <= b && a <= c && a <= d && a <= e) f = a;
        else if(b <= a && b <= c && b <= d && b <= e) f = b;
        else if(c <= a && c <= b && c <= d && c <= e) f = c;
        else if(d <= a && d <= b && d <= c && d <= e) f = d;
        else if(e <= a && e <= b && e <= c && e <= d) f = e;
        
        return f;
    }
}