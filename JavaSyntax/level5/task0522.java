package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов

Изучи класс Circle.
Напиши максимальное количество конструкторов с разными аргументами.
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(){
        
    }
    
    public Circle(double x){
        this.x = x;
    }
    
    public Circle(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
