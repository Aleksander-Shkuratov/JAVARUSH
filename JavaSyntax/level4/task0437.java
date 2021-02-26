package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок

Используя цикл for вывести на экран 
прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
*/

public class Solution {
    public static void main(String[] args) {
        
        for(int i = 1; i < 11; i = i + 1){
            for(int j = 0; j < i; j = j + 1){
                System.out.print("8");
            }
            System.out.println();
        }
        //напишите тут ваш код
    }
}
