package lesson9;

public class Product {


    String product;
    double standartPrice;
    double discount;


    //создать конструктор:
    public Product(String product) {
        this.product = product;
    }

    public double actualPriceCalculate(){

        double priceWithDiscount = standartPrice - standartPrice * discount;

        return priceWithDiscount;
    }

    //создаём метод для вывода на консоль:

                                 //(ввели переменную)
    public void printInformation(double priceWithDiscount){
        System.out.println("Product name : " + product);
        System.out.println("Standart price: " + standartPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Price with discount : " + priceWithDiscount);
    }
}
