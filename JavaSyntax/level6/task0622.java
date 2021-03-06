package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию

Задача: Написать программу,
которая вводит с клавиатуры 5 чисел
и выводит их в возрастающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int max;

        for(int i = 0; i < 5; i++){
            if(a > b){
                max = a;
                a = b;
                b = max;
            }
            if(b > c){
                max = b;
                b = c;
                c = max;
            }
            if(c > d){
                max = c;
                c = d;
                d = max;
            }
            if(d > e){
                max = d;
                d = e;
                e = max;
            }
        }

        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
        //напишите тут ваш код
    }
}
