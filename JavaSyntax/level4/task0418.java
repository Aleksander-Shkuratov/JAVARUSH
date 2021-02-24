package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция

Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = reader.readLine();
        String text2 = reader.readLine();
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);
        
        if(a>b)
            System.out.println(b);
        else if(a<b)
            System.out.println(a);
        else if(a==b)
            System.out.println(a);
        
        //напишите тут ваш код

    }
}
