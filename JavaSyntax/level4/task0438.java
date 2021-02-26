package com.javarush.task.task04.task0438;

/* 
Рисуем линии

Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).
*/

public class Solution {
    public static void main(String[] args) {
        
        for(int j = 0; j < 11; j++){
            for(int i = j; i < 1; i++){
                System.out.print("888888888");
            }
            System.out.println("8");
        }
        
        //напишите тут ваш код
    }
}
