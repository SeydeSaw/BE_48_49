package hw_BE_48_49m.hw_05_Jan_23;

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
        boolean isReweOpen = true;


        if (isEdekaOpen || isReweOpen) {
            boolean canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        }
        else {
            System.out.println("false : Магазины закрыты");
        }

    }
}
