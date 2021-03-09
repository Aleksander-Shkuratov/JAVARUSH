package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. 
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; i++){
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)%2 != 0 && list.get(i)%3 != 0){
                list4.add(list.get(i));
            }
            if(list.get(i)%3 == 0){
                list3.add(list.get(i));
            }
            if(list.get(i)%2 == 0){
                list2.add(list.get(i));
            }
        }
        printList(list3);
        printList(list2);
        printList(list4);
        //напишите тут ваш код
    }

    public static void printList(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}