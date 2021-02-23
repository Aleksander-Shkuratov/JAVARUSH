package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели

Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int nDay = Integer.parseInt(text);
        
        if(nDay==1)
            System.out.println("понедельник");
        else if(nDay==2)
            System.out.println("вторник");
        else if(nDay==3)
            System.out.println("среда");
        else if(nDay==4)
            System.out.println("четверг");
        else if(nDay==5)
            System.out.println("пятница");
        else if(nDay==6)
            System.out.println("суббота");
        else if(nDay==7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");
        
        //напишите тут ваш код

    }
}
