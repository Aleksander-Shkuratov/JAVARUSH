package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…

Написать метод, который возвращает результат
- глубину его стек-трейса - количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace().length;
        //напишите тут ваш код
    }
}
