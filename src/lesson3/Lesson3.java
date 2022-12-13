package lesson3;

public class Lesson3 {

    public static void main(String[] args) {

        int a1 = 10;
        int b1 = 15;

        int a2 = 100;
        int b2 = 150;

        int result1 = sum(a1,b1);

    //______Вызываем метод 1:

        System.out.println(result1);

        System.out.println(sum(a2,b2));

    //______Вызываем метод 2:

        System.out.println(sum(5,5));


    //______Вызываем метод 3:

        printText(1, result1);

        printText(2,sum(a2,b2));


    }

    //=========== Метод 2 : ==================

    public static int sum (int x, int y){
        int sum = x + y;
        return sum;

    }

    //============ Метода 3 : ==================
    public static void printText (int i, int text){
        System.out.println("Result sum " + i +  " = " + text);
    }



}
