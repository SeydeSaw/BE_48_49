package lesson6.example2;

public class ConditionalOperators {
    public static void main(String[] args) {

        int x = 150;

        //проверяем входит ли х в указанный диапозон:
        // (true && false) = false
        if (x > 0 && x <= 100) {
            System.out.println("x is between 0 and 100");

                   //(true && true)
        } else if (x > 100 && x <= 200) {
            System.out.println("x is between 100 and 200");
        }


        boolean rain = true;
        boolean cloud = true;
        boolean sun = true;


        if (sun && !rain) {
            System.out.println("Идем гулять с зонтом");
        } else {
            System.out.println("Идем гулять без зонта");
        }
    }
}
