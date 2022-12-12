import java.util.Scanner; //подключает Scanner

public class Lesson2InputFromKeybord {


    public static void main(String[] args) {

        //создаём объект класса Scanner:
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter number : ");
        int number = input.nextInt();

        System.out.println("Please enter your name: ");
        String name = input.nextLine();


        System.out.println("You number is : " + number);
        System.out.println("You name is : " + name);

    }


}
