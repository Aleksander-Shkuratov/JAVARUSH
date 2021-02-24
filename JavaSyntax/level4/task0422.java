package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+

Ввести с клавиатуры имя и возраст. 
Если возраст меньше 18 вывести надпись "Подрасти еще".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        
        int nAge = Integer.parseInt(age);
        
        if(nAge < 18)
            System.out.println("Подрасти еще");
        //напишите тут ваш код

    }
}
