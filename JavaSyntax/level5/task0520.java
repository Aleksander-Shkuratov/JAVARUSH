package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)

Создать класс прямоугольник (Rectangle). 
Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.
*/


public class Rectangle {
    int top;
    int left;
    int width;
    int height;
    
    public Rectangle(int top1){
        this.top = top1;
    }
    
    public Rectangle(int top2, int left2){
        this.top = top2;
        this.left = left2;
    }
    
    public Rectangle(int top3, int left3, int width3){
        this.top = top3;
        this.left = left3;
        this.width = width3;
    }
    
    public Rectangle(int top4, int left4, int width4, int height4){
        this.top = top4;
        this.left = left4;
        this.width = width4;
        this.height = height4;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
