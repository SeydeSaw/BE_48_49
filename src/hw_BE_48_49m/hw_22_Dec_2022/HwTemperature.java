package hw_BE_48_49m.hw_22_Dec_2022;

/*
Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно,
если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2.
В результате он выводит сообщение true или false.
 */

import java.util.Scanner;

public class HwTemperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first Temperature : ");
        int Temperature1 = scanner.nextInt();

        System.out.println("Please enter first Temperature : ");
        int Temperature2 = scanner.nextInt();


        if (Temperature1 >= 100 && Temperature2 <= 100) {
            boolean Device = true;
            System.out.println(Device);
        }
        else {
            boolean Device = false;
            System.out.println(Device);
        }

    }
}
