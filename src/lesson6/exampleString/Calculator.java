package lesson6.exampleString;

public class Calculator {

    //сложение:
    public int add(int x, int y){
        int sum = x + y;
        return  sum;
    }

    //вычитание:
    public int minus(int x, int y){
        //вариант 1 прописи:
        /*
        int minus = x - y;
        return minus;
        */

        //вариант 2 прописи:
        return (x - y);
    }

    //умножение:
    public int multiplication (int x, int y){
        return  x*y;
    }

    //деление:

    public int division (int x, int y){
        return  x/y;

    }

}
