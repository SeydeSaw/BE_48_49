package hw_BE_48_49m.hw_22_Dec_2022;

/*  Задача 1 :
Создайте две переменные isWeekend и isRain.
Создайте переменную canWalk, значение которой должно быть истинным,
если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
 */

public class HwWalk {

    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        if (isWeekend && !isRain) {
            boolean canWalk = true;
            System.out.println(canWalk + " : Идём гулять");

        } else {
            System.out.println("false : Остаёмся дома");
        }
    }

}
