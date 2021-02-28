package com.javarush.task.task05.task0504;

/* 
Трикотаж

Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
а точнее - основываясь на нём, как на шаблоне.
Их - котов - должно быть трое.
Наполните этих троих жизнью, то есть, конкретными данными.
*/

public class Solution {
    public static void main(String[] args) {
        
        Cat catVaska = new Cat("Vaska", 5, 10, 10);
        // catVaska.name = "Vaska";
        // catVaska.age = 5;
        // catVaska.weight = 10;
        // catVaska.strength = 10;
        
        Cat catPeter = new Cat("Peter", 4, 8, 9);
        // catPeter.name = "Peter";
        // catPeter.age = 4;
        // catPeter.weight = 8;
        // catPeter.strength = 9;
        
        Cat catBoris = new Cat("Boris", 8, 12, 11);
        // catBoris.name = "Boris";
        // catBoris.age = 8;
        // catBoris.weight = 12;
        // catBoris.strength = 11;
        //напишите тут ваш код
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
