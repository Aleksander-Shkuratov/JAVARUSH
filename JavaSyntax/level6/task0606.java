package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки

Ввести с клавиатуры положительное число. 
Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", 
где а - количество четных цифр, b - количество нечетных цифр.
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        
        while(a >= 1){
            
            int b = a%10;
            
            if(b%2 == 0){
                even++;
            }
            else{
                odd++;
            }
            
            a = a / 10;
        }
        
        System.out.println("Even: " + even + " Odd: " + odd);
        //напишите тут ваш код
    }
}
