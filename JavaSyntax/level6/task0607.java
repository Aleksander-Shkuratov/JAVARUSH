package com.javarush.task.task06.task0607;

/* 
Классовый счетчик

Создать статическую переменную int catCount в классе Cat.
Создай конструктор [public Cat()],
в котором увеличивай данную переменную на 1.
*/

public class Cat {
    
    static int catCount;
    
    public Cat(){
        Cat.catCount++;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
