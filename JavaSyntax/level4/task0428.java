package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число

Ввести с клавиатуры три целых числа.
Вывести на экран количество положительных чисел среди этих трех.
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
        int count = 0;
        
        if(a > 0){
            count = count + 1;}
        if(b > 0){
            count = count + 1;}
        if(c > 0){
            count = count + 1;}
        
        System.out.println(count);
        
        //напишите тут ваш код
    }
}
