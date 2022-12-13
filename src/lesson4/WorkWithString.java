package lesson4;

public class WorkWithString {

    public static void main(String[] args) {


        //String text = new String("Это текс для проверки работы методов типа String");

        String text = "Это текс для проверки работы методов типа String";

        String text1 = ""; //0 символов в строке

        System.out.println(text);//вывести на консоль написанный текст в строку

        System.out.println(text.length()); //длина строки, которая состоит из символов

        System.out.println(text1);//вывести на консоль написанный текст в строку

        System.out.println(text1.length()); //длина строки, которая состоит из символов


        //==================================================
        //============   Методы класса String ================
        //==================================================



        //============= 1. Метод isEmpty =====================

        text.isEmpty(); // метод возвращает значение boolean (true или false)

        //Если надо узнать пустая строка или нет:
        System.out.println(text.isEmpty());
        System.out.println(text1.isEmpty());


        //============= 2. Метод charAT =====================

        //text.charAt(индекс); //метод, который возвращает 1 символ определенного индекса

        //выводим только 1 символ из строки по заданному индексу:
        System.out.println(text.charAt(5));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(19));
        System.out.println(text.charAt(47));

        //============= 3. Метод substring  ================

        //_____ вариант 1 :

        //метод передаёт определенное количество символов по заданным индексам:
        String subText = text.substring(0, 10); // Например от 0 индекса до 10 индекса

        System.out.println(subText); //выводим определенное количество символов
        System.out.println(subText + " " + subText.length()); //выводим определенное количество символов + длину данной строки

        //_____ вариант 2 :

        //метод передаёт определенное количество символов по заданным индексам:
        String subText1 = text.substring( 10); // Например от 10 индекса

        System.out.println(subText1); //выводим определенное количество символов
        System.out.println(subText1 + " " + subText1.length()); //выводим определенное количество символов + длину данной строки


    }

}
