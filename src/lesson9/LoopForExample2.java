package lesson9;

public class LoopForExample2 {

    public static void main(String[] args) {

        String workString = "For loop example.";

        //цикл for:

        for (int i = 0; i < workString.length(); i++) {

            //объявляем переменную и присваиваем ей значение:
            char simbolFromOurString = workString.charAt(i);

            //выводим на консоль:
            System.out.println(i + " simbol from our string : " + simbolFromOurString);
        }

        System.out.println("===============");
        //===================
        //цикл while:

        int counter = 0;
        while (counter < workString.length()){
            //объявляем переменную и присваиваем ей значение:
            char simbolFromOurString = workString.charAt(counter);

            //выводим на консоль:
            System.out.println(counter + " simbol from our string : " + simbolFromOurString);

            counter++; //обязательно писать, иначе условие не будет выполняться
        }
    }
}
