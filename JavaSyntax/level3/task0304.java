package com.javarush.task.task03.task0304;

/* 
Задача на проценты

Напиши код метода addTenPercent, 
который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent
используй оператор return.
*/

public class Solution {
    public static double addTenPercent(int i) {
        return (i*1.1);
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
