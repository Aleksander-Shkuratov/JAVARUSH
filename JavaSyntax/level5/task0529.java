package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка

Вводить с клавиатуры числа и считать их сумму,
пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            String s = buffer.readLine();
            if(s.equals("сумма")){
                break;
            }
            else{
                int a = Integer.parseInt(s);
                sum = sum + a;
            }
        }

        System.out.println(sum);
        //напишите тут ваш код
    }
}
