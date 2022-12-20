package lesson7;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */

public class LessonCode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your figure : ");
        String userInput = scanner.nextLine();

//      if (userInput включает в себя символы только цифры или знак "-")

        //matches = вхождение/содержание

                               //обязательно без пробелов
//  если  в переменную входит ([символы от 0 до 9 и знак -] больше чем 0 раз)//больше чем 0 раз- означает, что строка не пустая
        if(userInput.matches("[0-9-]+")) {

            //возвращает значение boolean(true/false) например:
            //1. userInput = 01278933 или -8890985 = true
            //2. userInput = 0127d8933 = false

            //если true , то переходим к дальнейшим действиям:

            if (Integer.parseInt(userInput) < 0) {
                System.out.println("Your figure is negative!");
            }
            else if (Integer.parseInt(userInput) > 0) {
                System.out.println("Your figure is positive!");
            }
            else if (Integer.parseInt(userInput) == 0) {
                System.out.println("Your figure is 0");
            }
        }

            else {
                System.out.println("How is it possible?");
            }

    }
}
