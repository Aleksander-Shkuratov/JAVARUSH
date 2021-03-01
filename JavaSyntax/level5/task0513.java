package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник

Создать класс прямоугольник (Rectangle). 
Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)
*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;
    
    public void initialize(int t1){
        this.top = t1;
        this.left = 0;
        this.width = 0;
        this.height = 0;
    }
    
    public void initialize(int t2, int l2){
        this.top = t2;
        this.left = l2;
        this.width = 0;
        this.height = 0;
    }
    
    public void initialize(int t3, int l3, int w3){
        this.top = t3;
        this.left = l3;
        this.width = w3;
        this.height = 0;
    }
    
    public void initialize(int t4, int l4, int w4, int h4){
        this.top = t4;
        this.left = l4;
        this.width = w4;
        this.height = h4;
    }
    
    
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
