package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую

Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах,
прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        double t = Double.parseDouble(text);
        //System.out.println(t);
        double p = t%5;
        //System.out.println(p);
        
        if(t<5){
            if(t>=4)
                System.out.println("красный");
            else if(t>=3)
                System.out.println("жёлтый");
            else
                System.out.println("зелёный");
        }    
       else{
            if(p>=4)
            System.out.println("красный");
                else if(p>=3)
                    System.out.println("жёлтый");
                    else
                        System.out.println("зелёный");
        }
        //напишите тут ваш код

    }
}
