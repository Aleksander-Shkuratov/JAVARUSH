package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника

Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String textA = reader.readLine();
        String textB = reader.readLine();
        String textC = reader.readLine();
        int a = Integer.parseInt(textA);
        int b = Integer.parseInt(textB);
        int c = Integer.parseInt(textC);
        
        if(a<(b+c)&&b<(a+c)&&c<(a+b))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
        //напишите тут ваш код

    }
}
