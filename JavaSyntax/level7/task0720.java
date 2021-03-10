package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела

Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        
        for(int i = 0; i < n; i++){
            String s = reader.readLine();
            list.add(s);
        }
        
        for(int i = 0; i < m; i++){
            String sm = list.get(i);
            list.add(sm);
        }
        
        for(int i = 0; i < m; i++){
            list.remove(0);
        }
        
        for(int i = 0; i < n; i++){
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}