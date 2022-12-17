package hw_BE_48_49m.hw_15_Dec_22;

public class WorkWithString {

    public static void main(String[] args) {

        // TODO: 17.12.22 ===== Задание № 2 : =====


        String text = new String("I study Basic Java!");// создаём строку

        System.out.println(text.length()); //смотрим длину строки, которая состоит из символов

        System.out.println(text.charAt(18)); // выводим последний символ строки

        System.out.println(text.contains("Java"));//проверяем содержит ли строка слово Java

        String newString = text.replace('a', 'o');//создаём новую с троку и указываем символы для замены
        System.out.println(text);// выводим старую строку
        System.out.println(newString);//выводим новую строку

        System.out.println(text.toUpperCase());//преобразовываем строку к верхнему регистру
        System.out.println(text.toLowerCase());//преобразовываем строку к нижнему регистру

        String subText1 = text.substring(0,14);//передаём определённое количество символов по заданным индексам
        String subText2 = text.substring(18);//передаём количество символов начиная от указанного индекса
        System.out.println(subText1 + subText2); //выводим новые строки на консоль


    }



}
