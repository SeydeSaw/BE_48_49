package lesson7;

import java.util.Scanner;

public class LessonCode1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your figure  : ");
        int userInput = scanner.nextInt();


        if(userInput < 0){
            System.out.println("your figure is negative");
        }

        else if (userInput > 0) {
            System.out.println("your figure is positive");
        }

        else if(userInput == 0){
            System.out.println("your figure is 0");
        }

        else {
            System.out.println("How is it possible? ");
        }


    }
}
