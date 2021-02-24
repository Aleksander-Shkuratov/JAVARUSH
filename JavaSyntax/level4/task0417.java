package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?

Ввести с клавиатуры три целых числа. 
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = reader.readLine();
        String text2 = reader.readLine();
        String text3 = reader.readLine();
        
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);
        int c = Integer.parseInt(text3);
        
        if(a == b && a == c)
            System.out.println(a + " " + b + " " + c);
        else if(a == b)
            System.out.println(a + " " + b);
        else if(a == c)
            System.out.println(a + " " + c);
        else if(b == c)
            System.out.println(b + " " + c);     
      
        //напишите тут ваш код

    }
}
