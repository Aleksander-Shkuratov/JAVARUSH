package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату

Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        //напишите тут ваш код
    }
}
