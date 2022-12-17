package hw_BE_48_49m.hw_15_Dec_22;

public class WorkWithSystem {

    public static void main(String[] args) {
        // TODO: 17.12.22 ===== Задание № 1 : =====
        System.out.println();// пустая строка, для удобного чтения результата

        //0
        //перевод из 16-ричной в десятичную:
        System.out.println("333 в десятичной системе: " + (Integer.parseInt("333", 16)));
        System.out.println();// пустая строка, для удобного чтения результата

        //1
        //Разложить число 200345 на разряды в десятичной системе:

        int input = 200345;
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println("200345 разложено на разряды: " + (n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6));
        System.out.println();// пустая строка, для удобного чтения результата

        //2
        //перевод числа из десятичной в 16-ричную:
        String str2 = Integer.toString(637, 16);
        System.out.println("637 в 16-ричной системе : " + str2);

        //перевод числа из 16-ричной в десятичную:
        System.out.println("27d в десятичной системе: " + (Integer.parseInt("27d", 16)));
        System.out.println();// пустая строка, для удобного чтения результата

        //3
        //перевод из двоичной в десятичную:
        String str3 = Integer.toString(637, 2);
        System.out.println("637 в десятичной системе: " + str3);
        System.out.println();// пустая строка, для удобного чтения результата

        //4
        //перевод в десятичную:
        System.out.println("11100111 в десятичной системе: " + (Integer.parseInt("11100111", 2)));
        System.out.println();// пустая строка, для удобного чтения результата

        //5
        //перевод из десятичной в троичную:
        String str5 = Integer.toString(637, 3);
        System.out.println("637 в троичной системе: " + str5);

    }

}
