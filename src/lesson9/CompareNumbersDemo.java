package lesson9;

/*todo======== lesson8.Task_6.txt ========

Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */

import java.util.Scanner;

public class CompareNumbersDemo {

    public static void main(String[] args) {

        CompareNumbers compareNumbers = new CompareNumbers();

        compareNumbers.num1 = userInput("Please enter first number");
        compareNumbers.num2 = userInput("Please enter second number");

        compareNumbers.printInfo(compareNumbers.compare());

    }

    public static double userInput(String message){

        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }


}
