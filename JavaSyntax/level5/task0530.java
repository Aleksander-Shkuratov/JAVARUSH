package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Шеф, что-то не пашет

Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = reader.readLine();
        String text2 = reader.readLine();
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
