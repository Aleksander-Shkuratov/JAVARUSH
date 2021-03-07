package com.javarush.task.task07.task0704;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке,
каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        
        for(int i = 9; i >=0; i--){
            System.out.println(array[i]);
        }
        
        //напишите тут ваш код
    }
    
    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        
        for(int i = 0; i < array.length; i++){
            
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
    return array;
    }
}
