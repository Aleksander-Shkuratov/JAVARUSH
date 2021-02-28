package com.javarush.task.task05.task0510;

/* 
Кошкоинициация

Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;
    
    public void initialize(String aname){
        this.name = aname;
        this.age = 1;
        this.weight = 1;
        this.color = "black";
    }
    
    public void initialize(String bname, int b, int b1 ){
        this.name = bname;
        this.age = b1;
        this.weight = b;
        this.color = "white";
    }
    
    public void initialize(String cname, int c){
        this.name = cname;
        this.age = c;
        this.weight = 3;
        this.color = "red";
    }
    
    public void initialize(int d, String dcolor){
        this.age = 4;
        this.weight = d;
        this.color = dcolor;
    }
    
    public void initialize(int e, String ecolor, String eaddress){
        this.weight = e;
        this.color = ecolor;
        this.address = eaddress;
        this.age = 5;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
