package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight

Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот,
у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        
        int cat1count = 0;
        int cat2count = 0;
        
        if (this.age > anotherCat.age) {
            cat1count++;
        }
        else if (this.age < anotherCat.age) {
            cat2count++;
        }
      
        if (this.weight > anotherCat.weight) {
            cat1count++;
        }
        else if (this.weight < anotherCat.weight) {
            cat2count++;
        }
      
        if (this.strength > anotherCat.strength) {
            cat1count++;
        }
        else if (this.strength < anotherCat.strength) {
            cat2count++;
        }
        
        return cat1count > cat2count || cat1count == cat2count;
        
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
