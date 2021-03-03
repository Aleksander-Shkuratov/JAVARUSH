package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция

Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if(N > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int i = N-1; i > 0; i--) {
                int b = Integer.parseInt(reader.readLine());
                if (b > maximum) maximum = b;
            }
            System.out.println(maximum);
        }
        //напишите тут ваш код

    }
}
