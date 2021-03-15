package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения

Создать словарь (Map<String, String>) занести в него
десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие
с заданным именем или фамилией.
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("А", "Алексей");
        map.put("Б", "Александр");
        map.put("В", "Алекс");
        map.put("Г", "Михаил");
        map.put("Д", "Алекс");
        map.put("Е", "Алексей");
        map.put("Ж", "Александр");
        map.put("З", "Алекс");
        map.put("И", "Тимофей");
        map.put("К", "Максим");
        
        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count1 = 0;
        
        for (Map.Entry<String, String> pair : map.entrySet()){
            if(pair.getValue().equals(name)){
                count1++;
            }
        }
        
        return count1;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count2 = 0;
        
        for (Map.Entry<String, String> pair : map.entrySet()){
            if(pair.getKey().equals(lastName)){
                count2++;
            }
        }
        
        return count2;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
