package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник

Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = reader.readLine();
        String text2 = reader.readLine();
        int m = Integer.parseInt(text1);
        int n = Integer.parseInt(text2);
        
        for(int i = m; i > 0; i = i - 1){
            for(int j = n; j > 0; j = j - 1){
                System.out.print("8");
            }
            System.out.println();
        }
        //напишите тут ваш код
    }
}
