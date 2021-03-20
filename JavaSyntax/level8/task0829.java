package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО

Задача: Программа определяет, 
какая семья (фамилию) живёт в доме с указанным номером.
Новая задача:
Программа должна работать не с номерами домов, а с городами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house numbe
        String city = reader.readLine();

        for(int i =0; i < list.size(); i++){
            if(city.equals(list.get(i))){
                System.out.println((list.get(i+1)));
                break;
            }
        }

    }
}
