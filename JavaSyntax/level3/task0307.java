package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!

Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        
        Zerg zerg1 = new Zerg();
        zerg1.name = "A";
        Zerg zerg2 = new Zerg();
        zerg2.name = "B";
        Zerg zerg3 = new Zerg();
        zerg3.name = "C";
        Zerg zerg4 = new Zerg();
        zerg4.name = "D";
        Zerg zerg5 = new Zerg();
        zerg5.name = "E";
        
        Protoss protoss1 = new Protoss();
        protoss1.name = "1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "3";
       
        Terran terran1 = new Terran();
        terran1.name = "F";
        Terran terran2 = new Terran();
        terran2.name = "J";
        Terran terran3 = new Terran();
        terran3.name = "H";
        Terran terran4 = new Terran();
        terran4.name = "G";
        //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
