package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания

Ввести с клавиатуры число n.
Вывести на экран надпись 
"Я буду зарабатывать $n в час".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();

        System.out.println("Я буду зарабатывать $"+n+" в час");
        //напишите тут ваш код

    }
}
