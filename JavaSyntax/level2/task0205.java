package com.javarush.task.task02.task0205;

/* 
Прибавка к зарплате

В методе public static void hackSalary(int salary) 
увеличь зарплату на 100 
и выведи на экран надпись: "Твоя зарплата составляет: <salary+100> долларов в месяц."
Где <salary+100> - это зарплата увеличенная на 100.
*/
public class Solution {
    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }

    public static void hackSalary(int a) {
        System.out.println("Твоя зарплата составляет: " + (a + 100) + " долларов в месяц.");
        // напишите тут ваш код
    }
}
