package lesson6.exampleString;


public class StringOperationsDemo {




    public static void main(String[] args) {
        /*
        //создание экзэмпляра нового публичного класса:
        StringOperationsDemo demo = new StringOperationsDemo();
        */


       //================ Метод replease =====

        //создать 2 экзэмпляра:
        String oldString = "ABCAEA";
        String oldString1= "Java";


        replaceStringChar(oldString, oldString1);

        //--------------

        oldString = "In Java, Vitalii the best, super java programmer!";
        oldString1 = "In Java, Vitalii the best, Vitalii is super java programmer!";

        replaceStringString(oldString,oldString1);

    }

    public static void replaceStringChar(String oldString, String oldString1){

        //========  Метод replease =====
        //для замены 1 символа старой строки новой
        // вариант с ' ' :

        String newString = oldString.replace('A','B');

        System.out.println(oldString);
        System.out.println(newString);


        newString = oldString1.replace('a','i');

        System.out.println("==========");
        System.out.println(oldString1);
        System.out.println(newString);

    }

    public static void replaceStringString(String oldString, String oldString1){


        //========  Метод replease =====
        //для замены старой строки новой
        // вариант с " " :

        String newString = oldString.replace("Vitalii", "All group 48/49");

        System.out.println("==========");
        System.out.println(oldString);
        System.out.println(newString);

        newString = oldString1.replace("Vitalii", "All group 48/49");

        System.out.println("==========");
        System.out.println(oldString1);
        System.out.println(newString);


    }






}
