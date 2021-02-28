package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое

Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1,
вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        float sum = 0;
        int count = 0;
        
        while (true){
            String text = reader.readLine();
            int number = Integer.parseInt(text);
          
            if(number == -1){
                break;
            }
            else{
                sum = sum + number;
                count++;
            }
        }
        if (count > 0){
            System.out.println(sum / count);
        }
        
        //напишите тут ваш код
    }
}
