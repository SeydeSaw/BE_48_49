package lesson16_01_23;
// создание внутреннего класса ( Класс в классе)

public class TypeOfClasses {

    class Inner {

        public void show (){
            System.out.println("In a nested class method");
        }
    }

    public static void main(String[] args) {
        TypeOfClasses.Inner inner = new TypeOfClasses().new Inner();
        inner.show();
    }

}
