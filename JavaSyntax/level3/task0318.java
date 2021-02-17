package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира

Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        String name = reader.readLine();
       
        
        System.out.println(name +" захватит мир через " + nAge + " лет. Му-ха-ха!");
        //напишите тут ваш код

    }
}
