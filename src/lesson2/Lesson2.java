package lesson2;

import com.sun.source.util.SourcePositions;

public class Lesson2 {

    public static void main(String[] args) {

        //Задача 1. Найти сумму чисел:

        int c = 54;
        int d = 16;
        int result = c+d;


        //задача 2. Найти сумму чисел:

        int z = -5;
        int f = 8;
        int s = 6;

        //задача 3. Найти квадрат числа:

        int sqr = s*s;

        //задача 4. Найти результат со скидкой в 10% при покупке двух товаров :

        int a = 1000;
        int b = 500;

        int sum = a+b;

        double discount = sum * (10.0/100.0); //10.0/100.0 = 10%  // 15.0/100.0 = 15%
        double result4 = sum - discount;



        System.out.println("Результат задачи 1: " + result);

        System.out.println("Результат Задачи 2: " + (z+f+s));

        System.out.println("Результат Задачи 3: " + (sqr));

        System.out.println("Результат Задачи 4: " + result4);


        //_________Автоматическое преобразование________
        //byte -> short -> int -> long
        //Java автоматически переводит более маленький тип в более большой(например:int в long):

        int x = 1234567890;
        long x1 = x*100L;
        double y = x;

        System.out.println(x + " " + x1 + " " + y);

        //_________Искуственное приведение типов________________

        double x2 = 10.5;
        double x3 = 2.5;

        double resDouble = x2/x3;

        int resInt = (int) (x2/x3);

        System.out.println(resDouble + " " + resInt);

        //______

        String name1 = "Ivan";

        String name2 = " Petr";

        System.out.println("Hi, " + name1 + "! How are you?"); //канатация-объединение строк
        System.out.println("Hi, " + name2);

        String text1 = "Hello";
        String text2 = "World";

        String text = text1 + " " + text2;





    }



}
