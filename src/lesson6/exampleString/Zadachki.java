package lesson6.exampleString;

import java.util.Scanner;

public class Zadachki {


    public static void main(String[] args) {

        // ======= Задача 1 . Поменять местами значения двух переменных:

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

        System.out.println("Ваш первый номер: " + x);
        System.out.println("Ваш второй номер: " + y);


        //==== вариант решения 1: ===

        int tempVariable = x;
        x = y;
        y = tempVariable;

        System.out.println(" после замены : ");
        System.out.println("Ваш первый номер: " + x);
        System.out.println("Ваш второй номер: " + y);

        //==== вариант решения 2 : ====
        x = x + y;
        y = x - y;// y = (x первоначальный + y первоначальный) - y = x первоначальный
        x = x-y;// x = (x первоначальный + y первоначальный) - x  = y первоначальный










    }


}
