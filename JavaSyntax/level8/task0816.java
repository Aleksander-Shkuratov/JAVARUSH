package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы

Создать словарь (Map<String, Date>) 
и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("MAY 15 2012"));
        map.put("Петров", dateFormat.parse("JUNE 10 2012"));
        map.put("Сидоров", dateFormat.parse("JULY 20 2012"));
        map.put("Степанов", dateFormat.parse("MAY 18 2012"));
        map.put("Сивов", dateFormat.parse("MAY 11 2012"));
        map.put("Сурков", dateFormat.parse("MAY 12 2012"));
        map.put("Суворов", dateFormat.parse("MAY 13 2012"));
        map.put("Симонов", dateFormat.parse("MAY 14 2012"));
        map.put("Сомов", dateFormat.parse("MAY 16 2012"));
        
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        
        Iterator <Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        
        while(iterator.hasNext()){
            Map.Entry<String, Date> entry = iterator.next();
            int month = entry.getValue().getMonth();
            
            if (month >= 5 && month <= 7){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
