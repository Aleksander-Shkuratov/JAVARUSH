package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!

Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName(){
            return null;
        }
        public Cat getChild(){
            return null;
        }

    }

    public static class Dog extends Pet {
        public String getName(){
            return null;
        }
        public Dog getChild(){
            return null;
        }

    }

}
