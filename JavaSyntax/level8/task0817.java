package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Collections;

/* 
Нам повторы не нужны

Создать словарь (Map<String, String>) 
занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("A","Ron");
        map.put("B","Ron");
        map.put("C","Ron");
        map.put("D","Pol");
        map.put("F","Elise");
        map.put("G","Rol");
        map.put("E","Emma");
        map.put("H","Pol");
        map.put("J","Poly");
        map.put("K","Pol");
        
        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()){
             int j = Collections.frequency(map.values(), pair.getValue());
             
                if(j>1){
                    removeItemFromMapByValue(map, pair.getValue());
                }    
            }
            
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
