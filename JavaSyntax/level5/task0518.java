package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек

Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/


public class Dog {
    
    String name;
    int height;
    String color;
    
    public Dog(String aname){
        this.name = aname;
    }
    
    public Dog(String bname, int bheight){
        this.name = bname;
        this.height = bheight;
    }
    
    public Dog(String cname, int cheight, String ccolor){
        this.name = cname;
        this.height = cheight;
        this.color = ccolor;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
