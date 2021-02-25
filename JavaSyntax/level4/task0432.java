package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает

Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while.
Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String num = reader.readLine();
        int n = Integer.parseInt(num);
        
        while(n > 0){
            System.out.println(text);
            n = n - 1;
        }
        //напишите тут ваш код
    }
}
