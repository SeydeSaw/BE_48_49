package hw_BE_48_49m.hw_19_01_23;
/*

Дан массив из N целых чисел и целое число  K ,
найдите количество пар элементов в массиве, сумма которых равна K.

 */

import java.util.Arrays;
import java.util.Scanner;

public class FindPair {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Запрашиваем у пользователя размер массива:
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        // Создаем массив целых чисел:
        int[] array = new int[size];

        // Заполняем массив с консоли:
        System.out.println("Заполните массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        // Выводим на консоль заполненный массив:
        System.out.println(Arrays.toString(array));

        // Вводим целое число K с консоли :
        System.out.println("Введите целое число K : ");
        int k = in.nextInt();

        // Ищем количество пар элементов в массиве с суммой равной K :
        int pair = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] + array[j] == k) {
                    pair++;
                }
            }
        }

        //Выводим на экран ответ:
        System.out.println("Количество пар элементов в массиве с суммой равной числу " + k + " равно " + pair);

    }

}