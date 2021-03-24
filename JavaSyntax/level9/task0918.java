package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения

Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, 
чтобы у тебя появилось любые два checked исключения
и любые два unchecked исключения.
*/

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends Exception {
    }

    static class MyException2 extends Exception{
    }

    static class MyException3 extends RuntimeException{
    }

    static class MyException4 extends RuntimeException{
    }
}
