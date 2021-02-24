package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Фейс-контроль

Ввести с клавиатуры имя и возраст. 
Если возраст больше 20 вывести надпись "И 18-ти достаточно".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        
        int nAge = Integer.parseInt(age);
        
        if(nAge > 20)
            System.out.println("И 18-ти достаточно");
        //напишите тут ваш код

    }
}
