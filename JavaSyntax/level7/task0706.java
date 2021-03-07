ackage com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома

1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома,
а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой.
Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: 
"В домах с нечетными номерами проживает больше жителей."
или "В домах с четными номерами проживает больше жителей."
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //int[] array = initializeArray();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        for(int i = 0; i <= 14; i++){
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i = 0; i <= 14; i = i + 2){
            sum1 = sum1 + array[i];
        }
        
        for(int i = 1; i <= 14; i = i + 2){
            sum2 = sum2 + array[i];
        }
        
        if(sum1 > sum2){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        //напишите тут ваш код
    }
}
