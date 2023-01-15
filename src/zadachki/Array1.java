package zadachki;
import java.util.Random;
// todo
//  Дан массив из трёх рандомных элементов. Найти сумму элементов:

public class Array1 {

    public static void main(String[] args) {

            Random random = new Random();
            int[] array = new int[3];
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(5);
                System.out.println("Элемент массива " + i + ": " + array[i]);
                sum += array[i];
            }

            System.out.println("Сумма элементов массива: " + sum);
    }

}
