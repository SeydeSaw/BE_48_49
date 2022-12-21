package lesson9;

public class ProductDemo {
    public static void main(String[] args) {

        //создать экзэмпляр класса:
        Product productMilk = new Product("Milk");

        productMilk.standartPrice = 1.5;

        productMilk.discount = 0.1; //(0.1 = 10 / 100.0 = 10%)

        double actualPriceCalculate = productMilk.actualPriceCalculate();

        //вызываем метод из экзэмпляра класса и передаём значение double:
        productMilk.printInformation(actualPriceCalculate);


        //==== второй способ с другим выводом на консоль: ====
        System.out.println("__________________");

        Product productBread = new Product("Bread");

        productBread.standartPrice = 0.25;
        productBread.discount = 0.15;

        //вызываем метод из экзэмпляра класса и передаём значение double:
        productBread.printInformation(productBread.actualPriceCalculate());

    }
}
