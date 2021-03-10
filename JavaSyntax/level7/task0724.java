package com.javarush.task.task07.task0724;

/* 
Семейная перепись

Создай класс Human с полями имя(String), пол(boolean),
возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //        ArrayList<Human> humans = new ArrayList<Human>();
        Human a1 = new Human("Mark",true,50);
        Human a2 = new Human("Max",true,60);
        Human a3 = new Human("Lisa",false,55);
        Human a4 = new Human("Mila",false,40);
        Human a5 = new Human("Karl",true,21, a1, a3);
        Human a6 = new Human("Sven",true,20, a1, a3);
        Human a7 = new Human("Olga",false,18, a1, a3);
        Human a8 = new Human("Peter",true,20, a2, a4);
        Human a9 = new Human("Sofy",false,18, a2, a4);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        System.out.println(a5.toString());
        System.out.println(a6.toString());
        System.out.println(a7.toString());
        System.out.println(a8.toString());
        System.out.println(a9.toString());
        // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){

        }

        public Human(String name, boolean sex, int age, Human father, Human mother){

        }

        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
