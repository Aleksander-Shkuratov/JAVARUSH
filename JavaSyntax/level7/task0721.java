package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        
        int[] array = getInts();
        
        maximum = array[0];
        minimum = array[0];
        
        for(int i = 1; i < array.length; i++){
            if(array[i] > maximum){
                maximum = array[i];
            }
            if(array[i] < minimum){
                minimum = array[i];
            }
        }
        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
    
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        
        for(int i = 0; i < array.length; i++){
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
    return array;
    }
    //напишите тут ваш код
}