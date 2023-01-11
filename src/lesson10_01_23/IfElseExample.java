package lesson10_01_23;

public class IfElseExample {
    public static void main(String[] args) {

        int x = 5;

        //взаимоисключающая конструкция:
        if (x<0){
            System.out.println("x < 0");
        }
        if (x==0){
            System.out.println("x = 0");
        }
        if (x>0){
            System.out.println("x > 0");
        }

    }
}
