package com.javarush.task.task05.task0511;

/* 
Создать класс Dog

Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {
    String name;
    int height;
    String color;
    
    public void initialize(String aname){
        this.name = aname;
    }
    
    public void initialize(String bname, int b){
        this.name = bname;
        this.height = b;
    }
    
    public void initialize(String cname, int c, String ccolor){
        this.name = cname;
        this.height = c;
        this.color = ccolor;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
