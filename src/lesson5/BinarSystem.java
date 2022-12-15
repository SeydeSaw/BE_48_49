package lesson5;

import java.util.Scanner;

public class BinarSystem {

    /*
    Поскольку у нас десятичная система счисления,
    мы имеем 10 символов (цифр) для построения чисел.
    Начинаем порядковый счет: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Цифры закончились.
    Мы увеличиваем разрядность числа и обнуляем младший разряд: 10.
    Затем опять увеличиваем младший разряд,
    пока не закончатся все цифры: 11, 12, 13, 14, 15, 16, 17, 18, 19.
    Увеличиваем старший разряд на 1 и обнуляем младший: 20.
    Когда мы используем все цифры для обоих разрядов (получим число 99),
    опять увеличиваем разрядность числа и обнуляем имеющиеся разряды: 100.
    И так далее.

    0 -> 0
    1 -> 1
    2 -> 10
    3 -> 11
    4 -> 100
    5 -> 101
    6 -> 110
    7 -> 111
    8 -> 1000
    9 -> 1001
    10 -> 1010
    11 -> 1011
    12 -> 1100
    13 -> 1101
    14 -> 1110
    15 -> 1111




     */

    public static void main(String[] args) {
        String str;
        int i;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ведите любое целочисленное число, 0 для выхода");
        str = scanner.nextLine();

        i = Integer.parseInt(str);

        System.out.println("Число" + i + "");
    }




}
