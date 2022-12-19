package lesson7;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        //создаём сканнер для ввода с консоли:
        Scanner scanner = new Scanner(System.in);

        //просим пользователя ввести что-то:
        System.out.println("Input your choose : ");

        //объяляем переменную и присваиваем ей введённое пользователем значение:
        String userInput = scanner.nextLine();

    //оператор  переменная
        switch (userInput){

            case "add":
                System.out.println("You want add something... ");
                break;// для прерывания дальнейшей проверки, если есть совпадение

            case "delete":
                System.out.println("You want delete ");
                break;// для прерывания дальнейшей проверки, если есть совпадение

            case "replace":
                System.out.println("You want replace ");
                break;// для прерывания дальнейшей проверки, если есть совпадение

            default:
                System.out.println("What do you want? ");
        }
    }
}
