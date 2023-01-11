package lesson11_01_23;

import java.util.Scanner;

public class InputArray {

    public int [] userInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of array : ");
        int size = scanner.nextInt();

//создаём массив и переменную(createdArray) куда будут сохраняться данные
        int [] createdArray = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Please enter" + i + " element of array : ");
            createdArray [i] = scanner.nextInt();

        }
    //возвращаем переменную с данными
        return  createdArray;

    }

}
