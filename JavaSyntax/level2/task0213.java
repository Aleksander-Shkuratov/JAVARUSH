package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди

Создай объект типа Cat (кот),
объект типа Dog (собака),
объект типа Fish (рыбка)
и объект типа Woman.
Присвой каждому животному владельца (owner).
*/
public class Solution {
    public static void main(String[] args) {
        Woman baba = new Woman();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        cat.owner=baba;
        dog.owner=baba;
        fish.owner=baba;
        //напишите тут ваш код
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
