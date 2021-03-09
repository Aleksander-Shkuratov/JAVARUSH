package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму

1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        
        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
