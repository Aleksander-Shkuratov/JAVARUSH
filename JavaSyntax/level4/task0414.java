package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году

Ввести с клавиатуры год, определить количество дней в году. 
Результат вывести на экран в следующем виде:
количество дней в году: x
, где
х - 366 для високосного года,
х - 365 для обычного года.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int year = Integer.parseInt(text);
        
        if(year%400 == 0)
            System.out.println("количество дней в году: 366");
            else if(year%100==0)
                System.out.println("количество дней в году: 365");
            else if(year%4==0)
                System.out.println("количество дней в году: 366");
            else
                System.out.println("количество дней в году: 365");
        //напишите тут ваш код

    }
}
