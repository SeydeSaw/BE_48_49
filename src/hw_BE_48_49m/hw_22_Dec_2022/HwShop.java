package hw_BE_48_49m.hw_22_Dec_2022;

/*
Создайте две переменные isEdekaOpen и isReweOpen,
значения которых зависят от того, открыты магазины или нет.
Реализует логический метод canBuy, возвращающий true **
Значение этой переменной должно быть true,
если хотя бы один магазин открыт, иначе false.
Отобразите строку «Я могу купить еду, это ……» и значение.
 */

public class HwShop {

    public static void main(String[] args) {


        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        // | Условное ИЛИ. Возвращает true если хотя бы один из операндов равен true.
        //a = true; b = false; тогда a | b == true

        if (isEdekaOpen | isReweOpen) {
            boolean canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        }
        else if (isEdekaOpen | !isReweOpen) {
            boolean canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        }

        // & Логическое И. Возвращает true если оба операнда равны true.
        //a = true; b = false. тогда a & b == false
        //! Логическое “не”. Возвращает true если операнд является false. Возвращает false если операнд является true.

        else if (isEdekaOpen & !isReweOpen) {
            boolean canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        }

        //&& Условное И. То же самое, что и &, но если операнд, находящийся слева от & является false, данный оператор
        // возвращает false без проверки второго операнда.

         else if (isEdekaOpen && !isReweOpen) {
            boolean canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        }
         else if (!isReweOpen && isEdekaOpen) {
            boolean canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        }

        //|| Условное ИЛИ. То же самое, что и |, но если оператор слева является true, оператор возвращает true
        //без проверки второго операнда.

         else if (isEdekaOpen || isReweOpen) {
            boolean canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        }
         else if (!isReweOpen || isEdekaOpen) {
            boolean canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        }

        else {
            System.out.println("false : Магазины закрыты");
        }

    }
}
