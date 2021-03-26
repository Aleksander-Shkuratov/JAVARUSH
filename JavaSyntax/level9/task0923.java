package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные

Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] c = s.toCharArray();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> conconant = new ArrayList<>();

        for(char a : c){
            if(isVowel(a)){
                vowel.add(a);
            }
            else if(!isVowel(a) && a != ' '){
                conconant.add(a);
            }
        }

        for(int i = 0; i < vowel.size(); i++){
            System.out.print(vowel.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < conconant.size(); i++){
            System.out.print(conconant.get(i) + " ");
        }

        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
