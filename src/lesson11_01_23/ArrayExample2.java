package lesson11_01_23;
//todo
// простой пример с массивами в одном классе:

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {

        //создаём массив типа int:
        int [] array = new int[4];
        //объявляем переменные:
        array [0] = 6;
        array [1] = 9;
        array [2] = 15;
        //если нет одной переменной, то выведет 0

        //показать определенный элемент массива:
        System.out.println(array [2]);
        //показать весь массив:
        System.out.println(Arrays.toString(array));

        System.out.println(array[0] + array[1] + array[2]);

        //=======

        //создаём массив типа string:
        String [] stringArray = new String[4];
        //объявляем переменные:
        stringArray [0] = " word 1";
        stringArray [1] = " word 2";
        stringArray [2] = " word 3";
        //если нет одной переменной, то выведет слово null

        System.out.println(Arrays.toString(stringArray));
        System.out.println(stringArray[0] + stringArray [1] + stringArray [2]);


    }
}
