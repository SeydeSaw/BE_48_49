package lesson16_01_23;
// создание внутреннего класса ( Класс в классе)

public class TypeOfClasses2 {



    public static void main(String[] args) {
        Inner.show();
    }

    static class Inner {

        public static void show (){
            System.out.println("In a nested class method");
        }
    }
}
