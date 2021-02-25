package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!

Ввести с клавиатуры два целых числа,
которые будут координатами точки, 
не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти,
в которой находится данная точка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = reader.readLine();
        String text2 = reader.readLine();
        
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);
        
        if(a > 0 && b > 0)
            System.out.println("1");
        else if(a < 0 && b > 0)
            System.out.println("2");
        else if(a < 0 && b < 0)
            System.out.println("3");
        else if(a > 0 && b < 0)
            System.out.println("4");
        //напишите тут ваш код
    }
}
