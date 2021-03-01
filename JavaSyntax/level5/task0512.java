package com.javarush.task.task05.task0512;

/* 
Создать класс Circle

Создать класс (Circle) круг, с тремя инициализаторами:
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
    
    public void initialize(int x1, int y1, int r1){
        this.centerX = x1;
        this.centerY = y1;
        this.radius = r1;
    }
    
    public void initialize(int x2, int y2, int r2, int w2){
        this.centerX = x2;
        this.centerY = y2;
        this.radius = r2;
        this.width = w2;
    }
    
    public void initialize(int x3, int y3, int r3, int w3, int c3){
        this.centerX = x3;
        this.centerY = y3;
        this.radius = r3;
        this.width = w3;
        this.color = c3;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
