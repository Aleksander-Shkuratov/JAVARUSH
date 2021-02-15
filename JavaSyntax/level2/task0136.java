package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!

Pеализуй метод getWeight(int),
который принимает вес тела (в Ньютонах) на Земле, 
и возвращает, сколько это тело будет весить на Луне (в Ньютонах).
Тип возвращаемого значения - double.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double m =0.17*earthWeight;
        
        return m;
        //напишите тут ваш код
    }
}
