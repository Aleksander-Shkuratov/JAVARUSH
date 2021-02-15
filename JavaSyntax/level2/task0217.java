package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел

Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m;
        if(c<d)
            m=c;
        else
            m=d;
            
        if(min(a,b)<m)
            m=min(a,b);
        
        return m;    
        //напишите тут ваш код

    }

    public static int min(int a, int b) {
        if (a<b)
            return a;
        else
            return b;
        //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
