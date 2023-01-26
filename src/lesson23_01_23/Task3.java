package lesson23_01_23;

import java.util.Arrays;

public class Task3 {
    /*
    1. Создать массив - входные данные - количество элементво
    2. Заполнить массив случайными данными
    3. Поиск максимального элемента
    4. Поиск индекса последнего вхождения

     */

    public static void main(String[] args) {

        Task3Util task3Util = new Task3Util();

        //заполняем массив:
        int arraySize = 12;
        int startValue = -15;
        int endValue = 15;

        int[] workingArray = task3Util.fillArray(task3Util.createArray(arraySize), startValue,endValue );
        int maxElement = task3Util.findMaxElement(workingArray);
        int lastIndex = task3Util.findLastIndexElement(workingArray, maxElement);

        System.out.println(Arrays.toString(workingArray));
        System.out.println(" max element: " + maxElement);
        System.out.println(" last index: " + lastIndex);

    }
}
