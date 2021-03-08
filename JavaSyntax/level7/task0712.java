package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(s);
        }
        int max = list.get(0).length();
        int min = list.get(0).length();
        int a = 0;
        int b = 0;
        String s1 = list.get(0);
        String s2 = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() > max){
                max = list.get(i).length();
                a = i;
                s1 = list.get(i);
            }
            if(list.get(i).length() < min){
                min = list.get(i).length();
                b = i;
                s2 = list.get(i);
            }
        }
        if(a < b){
            System.out.println(s1);
        }
        else{
            System.out.println(s2);
        }
        
        //напишите тут ваш код
    }
}
