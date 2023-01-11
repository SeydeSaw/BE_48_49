package hw_BE_48_49m.hw_22_Dec_2022;

public class HwShopNew {

    boolean isEdekaOpen;
    boolean isReweOpen;

    public boolean canBuy() {
        if (isEdekaOpen || isReweOpen) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        HwShopNew shopNew = new HwShopNew();
        shopNew.isEdekaOpen = true;
        shopNew.isReweOpen = false;

        System.out.println("Я могу купить еду, это " + shopNew.canBuy());
    }
}
