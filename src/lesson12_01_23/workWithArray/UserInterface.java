package lesson12_01_23.workWithArray;

import java.util.Scanner;

public class UserInterface {

    public int userArraySizeInput(String message){

        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextInt();

    }
}
