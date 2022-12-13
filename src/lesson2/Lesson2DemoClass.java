package lesson2;

import lesson2.Cat;
import lesson2.Dog;

public class Lesson2DemoClass {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.age = 2;
        myDog.color = "black";
        myDog.name = "Pes";

        Dog dog2 = new Dog();
        dog2.age = 6;
        dog2.color = "gray";
        dog2.name = "Tuzik";

        Cat cat = new Cat();

        //вызываем свойства в виде метода:
        myDog.voiceDog(" Gav! ");
        dog2.voiceDog(" Gav, Gav , Gav");
        cat.voiceCat();

    }

}
