package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк

Создай массив, элементами которого будут списки строк.
Заполни массив любыми данными и выведи их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[10];

        for(int i = 0; i < 10; i++){
            ArrayList<String> list = new ArrayList<>();
                list.add("String1");
                list.add("String2");
            arrayOfStringList[i] = list;
        }
        //напишите тут ваш код

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
