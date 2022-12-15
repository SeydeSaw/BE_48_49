package lesson6.exampleString;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        //для работы с классом Calculator
        //создать экзэмпляр класса:
        Calculator ourCalculator = new Calculator();

        //создать сканнер для ввода с клавиатуры:
        Scanner scanner = new Scanner((System.in));

        //просим пользователя ввести значение в консоли:
        System.out.println("Enter integer x :");

        //присвоить переменной значение введенное в консоли:
        int x = scanner.nextInt();

        //просим пользователя ввести значение в консоли:
        System.out.println("Enter integer y :");

        //присвоить переменной значение введенное в консоли:
        int y = scanner.nextInt();

        //--- получаем результат сложения:

        int resultAdd = ourCalculator.add(x,y);
        System.out.println("Add result is: " + resultAdd);

        //--- получаем результат вычитания:

        int resultMinus = ourCalculator.minus(x,y);
        System.out.println("Minus result is: " + resultMinus);

        //--- получаем результат умножения:

        int resultMultiplication = ourCalculator.multiplication(x,y);
        System.out.println("Multiplication result is: " + resultMultiplication);


        //--- получаем результат деления:

        int resultDivision = ourCalculator.division(x,y);
        System.out.println("Division result is: " + resultDivision);


        /*
        //--- получаем результат деления:
        //способ 2:
        double resultDiv = CalculatorSpecial.div(x,y);
        System.out.println("Division result is : "+ resultDiv);
        */

        //--- получаем результат возведения в степень:
        double exponent = Math.pow(x,y);
        System.out.println("Exponent is :"+ exponent);
    }



}
