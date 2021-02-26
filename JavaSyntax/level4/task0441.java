package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько

Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
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

        if(a == b && b == c){
            System.out.println(a);
        }
        else if(a == b || a == c){
            System.out.println(a);
        }
        else if(b == c){
            System.out.println(b);
        }
        else if(a > b && a > c){
            if(b > c){
                System.out.println(b);
            }
            else
                System.out.println(c);
        }
        else if(b > a && b > c){
            if(a > c){
                System.out.println(a);
            }
            else
                System.out.println(c);
        }
        else if(c > a && c > b){
            if(a > b){
                System.out.println(a);
            }
            else
                System.out.println(b);
        }
        //напишите тут ваш код
    }
}
