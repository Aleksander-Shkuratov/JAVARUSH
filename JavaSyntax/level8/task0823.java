package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы

Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] words = s.split(" +");

        for (String ss : words){
            if(ss.length() != 0){
                String b = ss.substring(0,1).toUpperCase() + ss.substring(1) + " ";
                System.out.print(b);
            }

        }

        //напишите тут ваш код
    }
}
