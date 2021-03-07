package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?

1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран,
каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";
        String s5 = "s5";
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        System.out.println( list.size() );
        
        for(int i =-0; i < list.size(); i++){
            System.out.println( list.get(i) );
        }
        
        //напишите тут ваш код
    }
}
