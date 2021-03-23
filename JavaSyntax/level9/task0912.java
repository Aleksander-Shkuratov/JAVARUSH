package com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция

Перехватить исключение (и вывести его на экран),
указав его тип, возникающее при выполнении кода:
int num=Integer.parseInt("XYZ");
System.out.println(num);
*/

public class Solution {
    public static void main(String[] args) {
        
        try{
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}
