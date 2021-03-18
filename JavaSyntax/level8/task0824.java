package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

public class Solution {
    public static void main(String[] args) {

        Human c1 = new Human("Peter",true,15);
        Human c2 = new Human("Olga",false,13);
        Human c3 = new Human("Sonia",false,9);

        Human f = new Human("Pol",true,35, c1, c2, c3);
        Human m = new Human("Nina",false,33,c1, c2, c3);

        Human d1 = new Human("Jon",true,65, f);
        Human d2 = new Human("Bill",true,67, f);
        Human b1 = new Human("Emma",false,60, m);
        Human b2 = new Human("Lisa",false,62, m);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(f.toString());
        System.out.println(m.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        //напишите тут ваш код
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human ... human){
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, human);
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
