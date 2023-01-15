package hw_BE_48_49m.hw_12_01_23;

import java.util.Arrays;

/*
1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
     Выведите массив на экран в строку
     Замените каждый элемент с нечётным индексом на ноль
     Снова выведете массив на экран на отдельной строке

 */
public class Array {
    public static void main(String[] args) {

        int[] arr = new int[8];          // Создаем массив с 8 элементами

        for (int i = 0; i < arr.length; i++) {     // Цикл с проходом по массиву
            arr[i] = (int)(Math.random()*50)+ 1;   // Заполняем случайными числами

            // Выводим на экран в строку:
            System.out.println(Arrays.toString(arr));

        }

        System.out.println("=========================");

        for (int i = 0; i < arr.length; i++) {   // Цикл по массиву
            if(i%2 == 1){                       // Проверяем остаток от деления, если индекс нечетный
                arr[i] = 0;                     // Присваиваем элементу 0
            }

            System.out.println(Arrays.toString(arr));

            System.out.println(i + " Индекс: " + arr[i]);  // Выводим каждый элемент и его индекс

        }

    }
}
