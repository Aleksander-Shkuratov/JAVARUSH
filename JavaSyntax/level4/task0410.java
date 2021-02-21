package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём

Напиши метод checkInterval.
Метод должен проверять попало ли целое число в интервал от 50 до 100
и сообщить результат на экран в следующем виде:
"Число number не содержится в интервале."
или "Число number содержится в интервале.",
где number - аргумент метода.
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if (50<a && a<100)
            System.out.println("Число "+a+" содержится в интервале.");
        else
            System.out.println("Число "+a+" не содержится в интервале.");
        //напишите тут ваш код

    }
}
