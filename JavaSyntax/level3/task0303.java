package com.javarush.task.task03.task0303;

/* 
Обмен валют

Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd 
используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        
        System.out.println(convertEurToUsd(10, 1.05));
        
        System.out.println(convertEurToUsd(5, 1.20));
        //напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        
        double usd = eur*exchangeRate;
        
        return usd;
        //напишите тут ваш код

    }
}
