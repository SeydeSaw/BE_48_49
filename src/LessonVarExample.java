
public class LessonVarExample {

    public static void main(String[] args) {

        //объявляем переменную и присваиваем ей значение:
        int x = 25;

        //объявляем переменную:
        int y;
        //присваиваем ей значение:
        y = x/5;

        //объявляем переменную и присваиваем ей значение:
        int z;
        z=x+y;

        //объявляем переменную и присваиваем ей значение:
        double pi= 3.1415;

        double result = x*pi;

        //переменная boolean может иметь только 2 значение true или false:
        boolean check;
        //check = x>y;  //больше >
        //check = x<y; //меньше <
        check = x==y;  //равны ==



        //выводим в консоль переменную:
        System.out.println("x = " + x);

        System.out.println("y = " + y);

        System.out.println("z = " + z);

        System.out.println("result = " + result);

        System.out.println("Check is: "+ check);

        //____________Логические переменные_____________

        //присваиваем значение:
        boolean b1 = true;
        boolean b2 = false;

        //выводим в консоль переменную:
        System.out.println(b1&b2);//логическое умножение: если хотябы 1 элемент false, то результат будет false

        System.out.println(b1||b2);//логическое или : если хотябы 1 элемент true, то результат будет true

        System.out.println(!b1);//логическое отрицание : противоположная сторона присвоенному элементу


    }
}
