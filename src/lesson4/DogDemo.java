package lesson4;

import java.util.Scanner;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog("Lessy", "Kolli", 3);

        /*
        myDog.name = "Lessy";
        myDog.breed = "Kolli";
        myDog.age = 3;
        */

        myDog.voice("Gav! Gav! Gav!");

        myDog.age = myDog.age + 1;

        System.out.println(myDog.toString());

        Dog myDog2 = new Dog("Tuzik", 5);

        System.out.println(myDog2);

        Dog myDog3 = new Dog("Bobik", "Taksa");

        System.out.println(myDog3);


        //----------------
        Scanner scanner = new Scanner(System.in);



        System.out.println("Input Dog name: ");
        System.out.println("Input Dog breed: ");
        System.out.println("Input Dog age: ");

        //Присвоить переменной введенный текс:
        String dogName = scanner.nextLine();

        //Присвоить переменной введенный текс:
        String dogBreed = scanner.nextLine();

        //Присвоить переменной введенный текс:
        int dogAge = scanner.nextInt();

        Dog myDog4 = new Dog(dogName,dogBreed,dogAge);




        System.out.println(myDog4);

        //_______________





    }


}
