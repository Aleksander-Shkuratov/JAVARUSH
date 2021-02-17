package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее

Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sNumber1 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        String sNumber2 = reader.readLine();
        int nNumber2 = Integer.parseInt(sNumber2);
        
        System.out.println(name + " получает "+nNumber1+" через "+nNumber2+" лет.");
        //напишите тут ваш код

    }
}
