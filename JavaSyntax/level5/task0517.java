package com.javarush.task.task05.task0517;

/* 
Конструируем котиков

Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, 
то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. 
А вот имени может и не быть (null). 
То же касается адреса: null.
*/

public class Cat {
    
    String name;
    int age;
    int weight;
    String address;
    String color;
    
    public Cat(String aname){
        this.name = aname;
        this.age = 1;
        this.weight = 1;
        this.color = "black";
    }
    
    public Cat(String bname, int b1, int b2){
        this.name = bname;
        this.weight = b1;
        this.age = b2;
        this.color = "red";
    }
    
    public Cat(String cname, int c){
        this.name = cname;
        this.age = c;
        this.weight = 3;
        this.color = "white";
    }
    
    public Cat(int d, String dcolor){
        this.weight = d;
        this.color = dcolor;
        this.age = 4;
    }
    
    public Cat(int e, String ecolor, String eaddress){
        this.weight = e;
        this.color = ecolor;
        this.address = eaddress;
        this.age = 5;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
