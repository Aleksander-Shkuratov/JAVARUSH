package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел

Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = reader.readLine();
        String text2 = reader.readLine();
        String text3 = reader.readLine();
        
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);
        int c = Integer.parseInt(text3);
        
        //int max;
        //int min;
        //int middle 
        
        int tmp;
        
        if(b < c){
            tmp = c;
            c = b;
            b = tmp;
            if(b < a){
            tmp = b;
            b = a;
            a = tmp;
            }
        }
        if(a<b){
            tmp = b;
            b = a;
            a = tmp;
            if(b < c){
            tmp = c;
            c = b;
            b = tmp;
            }
        }
        System.out.println(a + " " + b + " " + c);   
           
        //напишите тут ваш код

    }
}
