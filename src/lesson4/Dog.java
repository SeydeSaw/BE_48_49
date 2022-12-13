package lesson4;

public class Dog {

    String name;

    String breed;

    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog() {
    }

    public void voice (String voice){
        System.out.println(voice);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }



}
