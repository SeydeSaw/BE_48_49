package hw_BE_48_49m.hw_12_01_23;

import java.util.Arrays;

/*
2) Создайте массив из 5 случайных целых чисел из интервала [10;99]
    Выведите его на экран в строку.
    Определите и выведите на экран сообщение о том,
    является ли массив строго возрастающей последовательностью.
 */

public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*99) + 10;

        }
        System.out.println(Arrays.toString(arr));


        boolean message = true;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] <= arr[i+1]){
                message = false;
            }
        }
        if(message){
            System.out.println("Массив является строго возрастающей последовательностью");
        }
        else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }

    }
}
