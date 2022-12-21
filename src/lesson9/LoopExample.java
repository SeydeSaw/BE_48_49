package lesson9;

import java.util.Scanner;

public class LoopExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x=1;
        int y=1;

        boolean condition = true;

        while (condition){
            System.out.println("Please enter 2 numbers. If You enter first number 100 - exit");

            //выполняется действие:
            System.out.println("Enter x num: ");
            x = scanner.nextInt();

            System.out.println("Enter y num: ");
            y = scanner.nextInt();

            System.out.println("Add result : " + (x+y));

            //для прекращения цикла:
            if (x==100){
                condition = false;
            }
            System.out.println("stop loop while");

        }




        /*
        //здесь можем присвоить любое значение переменным, главное не Ноль
        int x=1;
        int y=1;

        boolean condition = true;

        while (condition){
            System.out.println("Please enter 2 numbers. If You enter double 0 - exit");

            //выполняется действие:
            System.out.println("Enter x num: ");
            x = scanner.nextInt();

            System.out.println("Enter y num: ");
            y = scanner.nextInt();

            System.out.println("Add result : " + (x+y));

            condition = !((x==0)&&(y==0));// отрицание, для остановки цикла

        }

        //=========== второй способ:

        //здесь можем присвоить любое значение переменным, главное не Ноль
        //int x=1;
        //int y=1;

        //создаём цикл:
        // пока x и y НЕ равны 0
        while ((x!=0)&&(y!=0)){

            //выполняется действие:
            System.out.println("Enter x num: ");
            x = scanner.nextInt();

            System.out.println("Enter y num: ");
            y = scanner.nextInt();

            System.out.println("Add result : " + (x+y));
        }

        */





    }
}
