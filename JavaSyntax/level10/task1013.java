package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human

Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private String name;
        private int age;
        private int height;
        private int weight;
        private String hair;
        private String skinColor;

        public Human(){};
        public Human(String name){};
        public Human(String name, int age){};
        public Human(String name, int age, int height){};
        public Human(String name, int age, int height, int weight){};
        public Human(String name, int age, int height, int weight, String hair){};
        public Human(String name, int age, int height, int weight, String hair, String skinColor){};
        public Human(int height, String hair){};
        public Human(int height , int weight){};
        public Human(String hair, String age){};

        // Напишите тут ваши переменные и конструкторы
    }
}
