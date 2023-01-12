package lesson12_01_23.workWithArray;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        //1. Создать массив Create Array
        //2. Заполнить массив Fill Array
        //3. Найти макс и мин Find max , min
        //4. разбить массив split Array
        //5. Отсортировать массив Sort Array


        //создаём экзэмпляры рабочих классов:

        ArrayCreateAndFill arrayCreateAndFill = new ArrayCreateAndFill();
        UserInterface userInterface = new UserInterface();
        ArrayUtil arrayUtil = new ArrayUtil();

        //=========

        //получаем размер нашего массива с помощью данных в классе UserInterface:
        int arraySize = userInterface.userArraySizeInput("Please enter array size ");

        //создаём новый пустой массив размера arraySize:
        //вызываем метод createArray и передаём туда данные переменной arraySize
        int [] ourWorkingArray = arrayCreateAndFill.createArray(arraySize);

        //заполняем массив случайными числами заданного нами диапозона:
        arrayCreateAndFill.fillArray(ourWorkingArray, true, 100);
        //если поменять true на false , то массив будет заполняться цифрами введеными пользователем с клавиатуры


        System.out.println(Arrays.toString(ourWorkingArray));

        //==========

        //обращаемся к классу ArrayUtil:
        //вызываем метод findMaxElement
        int maxFromArray = arrayUtil.findMaxElement(ourWorkingArray);
        //вызываем метод findMinElement
        int minFromArray = arrayUtil.findMinElement(ourWorkingArray);

        System.out.println("Max element from array is : " + maxFromArray);
        System.out.println("Min element from array is : " + minFromArray);

        //==========

        // разбиение массива на 2 части:

        int indexForSplit = userInterface.userArraySizeInput("Please enter index for split less this " + (ourWorkingArray));
        //от начала до середины
        int[] newArrayPart1 = arrayUtil.createNewArrayFromOurArray(ourWorkingArray,0,indexForSplit);
        //от середины до конца
        int[] newArrayPart2 = arrayUtil.createNewArrayFromOurArray(ourWorkingArray,indexForSplit+1, ourWorkingArray.length-1);

        System.out.println(Arrays.toString(newArrayPart1 ));
        System.out.println(Arrays.toString(newArrayPart2 ));

    }
}
