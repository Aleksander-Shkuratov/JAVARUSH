package com.javarush.task.task02.task0204;

/* 
О семейных отношениях

В методе main создай объект Man,
сохрани ссылку на него в переменную man.
Создай также объект Woman
и сохрани ссылку на него в переменную woman.
*/
public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
        //напишите тут ваш код
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
