package com.javarush.task.task05.task0509;

/* 
Создать класс Friend

Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend {
    private String name;
    private int age;
    private char sex;
    
    public void initialize(String nname){
       this.name = nname; 
    }
    
    public void initialize(String nname, int n){
        this.name = nname;
        this.age = n;
    }
    
    public void initialize(String nname, int n, char z){
        this.name = nname;
        this.age = n;
        this.sex = z;
    }
    
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
