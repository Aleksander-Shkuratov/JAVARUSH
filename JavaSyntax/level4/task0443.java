package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали

Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year = reader.readLine();
        String mounth = reader.readLine();
        String day = reader.readLine();
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(mounth);
        int d = Integer.parseInt(day);

        System.out.println("Меня зовут " + name +".");
        System.out.println("Я родился " + d + "." + m + "." + y);

        //напишите тут ваш код
    }
}
