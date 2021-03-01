package com.javarush.task.task05.task0516;

/* 
Друзей не купишь

Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend {
    
    String name;
    int age;
    char sex;
    
    public Friend(String aname){
        this.name = aname;
    }
    
    public Friend(String bname, int b){
        this.name = bname;
        this.age = b;
    }
    
    public Friend(String cname, int c, char csex){
        this.name = cname;
        this.age = c;
        this.sex = csex;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
