package hw_BE_48_29.hw_15_Dec_22;


import java.util.Scanner;

public class WorkWithScanner {

    public static void main(String[] args) {

        // TODO: 17.12.22 ===== Задание № 3 : =====

        Scanner scanner = new Scanner(System.in);


        //просим ввести строку из консоли:
        System.out.println("Введите слово с чётным кол-вом букв ");

        //присваиваем введённое значение:
        String str1 = scanner.nextLine();

        //просим ввести строку из консоли:
        System.out.println("Введите слово с чётным кол-вом букв");

        //присваиваем введённое значение:
        String str2 = scanner.nextLine();

        //смотрим длину строки, которая состоит из символов:
        System.out.println(str1.length() + " " + str2.length());

        //проверяем строка состоит из четного или нечетного кол-ва символов:

        boolean checkResult = ((str1.length() % 2) == 0);

        boolean checkResult2 = ((str2.length() % 2) == 0);

        System.out.println(checkResult);
        System.out.println(checkResult2);

        // создаём третью переменную, которая будет принимать:
        // первую половину от первой строки и вторую половину от второй строки
        String str3 = (str1.substring(0, str1.length()/2)) +
                (str2.substring(str2.length()/2, str2.length()));

        //выводим на консоль полученный результат от двух строк:
        System.out.println(str3);


        //todo ===========================

        //создаём экзэмпляр класса Calculator:
        Calculator calculator = new Calculator();

        //просим пользователя ввести значение в консоли:
        System.out.println("Enter x : ");

        //присвоить переменной значение введенное в консоли:
        double x = scanner.nextDouble();

        //просим пользователя ввести значение в консоли:
        System.out.println("Enter y : ");

        //присвоить переменной значение введенное в консоли:
        double y = scanner.nextDouble();

        //присваиваем переменной введенное значение и вызываем метод plus:
        double resultPlus = Calculator.plus(x,y);
        System.out.println("Plus result is: " + resultPlus);

        //присваиваем переменной введенное значение и вызываем метод minus:
        double resultMinus = Calculator.minus(x,y);
        System.out.println("Minus result is: " + resultMinus);

        //присваиваем переменной введенное значение и вызываем метод multiplication:
        double resultMultiplication = Calculator.multiplication(x,y);
        System.out.println("Multiplication result is: " + resultMultiplication);

        //присваиваем переменной введенное значение и вызываем метод division:
        double resultDivision = Calculator.division(x,y);
        System.out.println("Division result is: " + resultDivision);


        //todo================================

        //создаём экзэмпляр класса Converter:
        Converter converter = new Converter();

        //просим пользователя ввести значение в консоли:
        System.out.println("Введите сумму в евро : ");

        //присваиваем переменной введённое значение:
        double euro = scanner.nextDouble();

        //выводим на консоль то, что ввёл пользователь:
        System.out.println("Ваша сумма в евро: " + euro + " €");

        //вызываем метод convertEuroToUsd и выводим на консоль:
        System.out.println("Перевод суммы евро в доллар США: " + converter.convertEuroToUsd(euro) + " $");


    }


}
