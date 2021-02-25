package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа

Ввести с клавиатуры три целых числа.
Вывести на экран количество положительных 
и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а",
"количество положительных чисел: б",
где а, б - искомые значения.
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
        int count1 = 0;
        int count2 = 0;
        
        if(a > 0){
            count1 = count1 + 1;
        }
        else if(a < 0){
            count2 = count2 + 1;
        }
        
        if(b > 0){
            count1 = count1 + 1;
        }
        else if(b < 0){
            count2 = count2 + 1;
        }
        
        if(c > 0){
            count1 = count1 + 1;
        }
        else if(c < 0){
            count2 = count2 + 1;
        }
        
        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count1);
        
        //напишите тут ваш код
    }
}
