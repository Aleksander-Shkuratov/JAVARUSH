package com.javarush.task.task06.task0613;

/* 
Кот и статика

В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. 
Пусть при каждом создании кота (нового объекта Cat) 
статическая переменная catCount увеличивается на 1.
Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        // Создай 10 котов

        System.out.println(Cat.catCount);

        // Выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount;

        public Cat(){
            catCount++;
        }
        // Создай статическую переменную catCount

        // Создай конструктор
    }
}