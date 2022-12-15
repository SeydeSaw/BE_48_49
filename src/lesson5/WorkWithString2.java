package lesson5;

public class WorkWithString2 {
    public static void main(String[] args) {

        String text = "   Это текст для проверки работы методов типа String     ";

        StringMethodsTest(text);


    }

    public static void StringMethodsTest(String text){


        String testString = "текст";

        //============  Метод contains  ==================
        //проверяет есть ли в нашем тексте определеный набор символов/текст(слово/символ)

        //text.contains(testString);//возвращает boolean (true/false)

        //---- 1 вариант поиска совпадений и вывода на консоль:

        boolean resultContains = text.contains(testString);

        //выводим в консоль результат:
        System.out.println(resultContains);

        //---- 2 вариант поиска совпадений и вывода на консоль:

        System.out.println(text.contains("Petr"));


        //====== Метод toUpperCase и toLowerCase ========
        // применяется для игнорирования регистра при поиске совпадений

        System.out.println(text.toUpperCase());

        System.out.println(text.toLowerCase());

        //===== Метод trim ======
        //применяется для обрезки пробелов покраям

        System.out.println(text.trim());

        //============ Метод valueOf ===========
        //применяется чтобы из типа int сделать тип String
        int catAge = 7;

        // 1 вариант :

        String catAgeStringType = String.valueOf(catAge);

        System.out.println(catAgeStringType);

        // 2 вариант :

        String catAgeStringType2 = "" + catAge;
        System.out.println(catAgeStringType2);

        //============ классы Integer и Double ======
        //классы, в которых уже прописаны определённые методы
        //============ методы parseInt и parseDouble (parse - преобразовать)
        //применяется чтобы аргументы типа String воспринимать как тип int/ double

        String inputFromKeyboard = "125";

        Integer resultInt = Integer.parseInt(inputFromKeyboard);

        Double resultDouble = Double.parseDouble("12.65");

        System.out.println(resultInt + resultDouble);


        //=================

        System.out.println(text.indexOf("метод"));
        System.out.println(text.lastIndexOf("метод"));

        /*
        1. посмотреть в интеренете решение как найти индексы трех разных вхождений подстроки
        2. замена символов (replase())
        */


    }

}