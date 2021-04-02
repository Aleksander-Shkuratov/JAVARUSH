package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!

Программа вводит с клавиатуры пару (число и строку)
и выводит их на экран.
Нужно сделать так, чтобы программа вводила 
с клавиатуры пары (число и строку) и сохраняла их в HashMap.

Ключевые требования:
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while(true){
            try{
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name,id);
            }
            catch (NumberFormatException e){
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String name = pair.getKey();
            int id = pair.getValue();
            System.out.println(id + " " + name);
        }
    }
}
