package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //String[] arrayS = initializeArrayS();
        String[] arrayS =new String[10];
        int[] arrayI = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < arrayS.length; i++){
            arrayS[i] = reader.readLine();
            String a = arrayS[i];
            arrayI[i] = a.length();
        }
        
        for(int j = 0; j < arrayI.length; j++){
            System.out.println(arrayI[j]);
        }
        //напишите тут ваш код
    }  
}
