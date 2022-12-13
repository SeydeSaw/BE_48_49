package lesson3;

import java.sql.SQLOutput;

public class EnterPerson {

    public static void main(String[] args) {
        Human person1 = new Human();

        person1.name = "Ivan";
        person1.age = 25;
        person1.town = "Berlin";

        System.out.println(person1.name + " " + person1.age + " " + person1.town);

        //________

        Human person2 = new Human();

        person2.name = "Ruslan";
        person2.age = 30;
        person2.town = "Riga";

        System.out.println(person2.name + " " + person2.age + " " + person2.town);

        //_______
        //переменная экзэмпляра:
        person1.age = 26;
        person1.town = "London";

        person1.greeting();

        System.out.println(person1.age + " " + person1.town);


    }
}
