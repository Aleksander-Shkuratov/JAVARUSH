package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел

Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {

        ArrayList<int[]> list = new ArrayList<int[]>();

        int[] arrya0 = new int[]{1, 2, 3, 4, 5};
        int[] arrya1 = new int[]{1, 2};
        int[] arrya2 = new int[]{1, 2, 3, 4};
        int[] arrya3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arrya4 = new int[0];

        list.add(arrya0);
        list.add(arrya1);
        list.add(arrya2);
        list.add(arrya3);
        list.add(arrya4);

        return list;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
