package lesson9;

import java.util.Scanner;

public class Zadachi {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first num: ");
        int x = scanner.nextInt();

        System.out.println("Enter second num: ");
        int y = scanner.nextInt();


        if (x<=y){
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }




    }
}
