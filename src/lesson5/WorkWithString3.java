package lesson5;


public class WorkWithString3 {

    public static void main(String[] args) {

        String text = "   Это текст для проверки работы методов типа String     ";

        StringMethodsTest(text);


    }


    public static void StringMethodsTest(String text) {

        //============ Сравнение строк =======

        int a = 5;
        int b = 10;


        System.out.println(a==b);
        System.out.println("Java" == "Java");
        System.out.println("____compare with '==' _____");

        String str1 = "Java";
        String  str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Java";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str3 == str4);


        // ==  - двойное равенство применяется только для сравнения чисел

        //========== Метод equals ===========

        //применяется только к переменным типа String
        //позволяет сравнивать не название, а содержание( не ссылки, а значение)

        System.out.println("____compare with .equals _____");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str3.equals(str4));



    }

}
