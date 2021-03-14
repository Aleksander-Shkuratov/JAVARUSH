package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите

Создать множество чисел(Set<Integer>), 
занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 20; i++){
            set.add(i);
        }
        return set;
        // напишите тут ваш код

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> integerIterator = set.iterator();
        while(integerIterator.hasNext()){
            Integer a = integerIterator.next();
            if(a > 10){
                integerIterator.remove();
            }
        }
        
        return set;
        // напишите тут ваш код
    
    }

    public static void main(String[] args) {

    }
}
