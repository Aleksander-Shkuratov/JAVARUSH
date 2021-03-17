package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Только для богачей

Создать словарь (Map<String, Integer>) и
занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Alex", 1000);
        map.put("Aleksander", 2000);
        map.put("Don", 400);
        map.put("Pol", 1500);
        map.put("Peter", 450);
        map.put("Ada", 800);
        map.put("Sol", 900);
        map.put("Fill", 1100);
        map.put("Mila", 1000);
        map.put("Lisa", 1000);
        
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        
        Iterator <Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        
        while (entries.hasNext()){
            Map.Entry<String, Integer> entry = entries.next();
            
            if(entry.getValue() < 500){
                entries.remove();
            }
        }
        
    }

    public static void main(String[] args) {

    }
}
