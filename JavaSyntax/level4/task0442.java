package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование

Вводить с клавиатуры числа.
Если пользователь ввел -1,
вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true){
            String text = reader.readLine();
            int number = Integer.parseInt(text);
            sum = sum + number;

            if (number == -1){
                break;
            }
        }
        System.out.println(sum);
        //напишите тут ваш код

    }
}
