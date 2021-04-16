package com.javarush.task.task12.task1207;

/* 
Int и Integer

Реализуй два метода: print(int) и print(Integer).
Напиши такой код в методе main(), чтобы вызвались оба.
*/

public class Solution {
    public static void main(String[] args) {
        
        int a = 12;
        Integer b = 50;
        
        print(a);
        print(b);

    }
    
    public static void print(int a){
        System.out.println(a);
    }
    
    public static void print(Integer b){
        System.out.println(b);
    }

    //Напишите тут ваши методы
}
