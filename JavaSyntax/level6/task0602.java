package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы

В каждом классе Cat и Dog написать метод finalize,
который выводит на экран текст о том,
что такой-то объект уничтожен.
*/

public class Cat {
    public static void main(String[] args) {

    }
    
    protected void finalize() throws Throwable
    {
        System.out.println("A Cat was destroyed");
    }

    //напишите тут ваш код

}

class Dog {
    
    protected void finalize() throws Throwable
    {
        System.out.println("A Dog was destroyed");
    }
    //напишите тут ваш код
}
