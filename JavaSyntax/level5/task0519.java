package com.javarush.task.task05.task0519;

/* 
Ходим по кругу

Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle {
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;
    
    public Circle(int centerX1, int centerY1, int radius1){
        this.centerX = centerX1;
        this.centerY = centerY1;
        this.radius = radius1;
    }
    
    public Circle(int centerX2, int centerY2, int radius2, int width2){
        this.centerX = centerX2;
        this.centerY = centerY2;
        this.radius = radius2;
        this.width = width2;
    }
    
    public Circle(int centerX3, int centerY3, int radius3, int width3, int color3){
        this.centerX = centerX3;
        this.centerY = centerY3;
        this.radius = radius3;
        this.color = color3;
        this.width = width3;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
