package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?

Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try{
            Date date = formatter.parse(s);
            SimpleDateFormat formatt = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            System.out.println(formatt.format(date).toUpperCase());
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //напишите тут ваш код
    }
}
