package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел

Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = reader.readLine();
        String text2 = reader.readLine();
        String text3 = reader.readLine();
        String text4 = reader.readLine();
        
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);
        int c = Integer.parseInt(text3);
        int d = Integer.parseInt(text4);
        
        if(a >= b && a >= c && a >= d)
            System.out.println(a);
        else if(b >= a && b >= c && b >= d)
            System.out.println(b);
        else if(c >= a && c >= b && c >= d)
            System.out.println(c);
        else
            System.out.println(d);
        
        //напишите тут ваш код

    }
}
