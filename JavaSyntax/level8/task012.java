package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной 
последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        
        int count1 = 1;
        int count2 = 1;
        
        for(int i = 1; i <= 9; i++){
            if(list.get(i).equals(list.get(i - 1))){
                count1++;
                if(count1 > count2){
                    count2 = count1;
                }
            }
            else{
                count1 = 1;
            }  
        }
        
        System.out.println(count2);
        
        
        //напишите тут ваш код
    }
}
