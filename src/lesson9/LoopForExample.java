package lesson9;


import java.util.Random;

public class LoopForExample {

    public static void main(String[] args) {

        Random random = new Random();


        for (int i = 0; i < 10; i++) {

        //обязательно объявляем переменную до if, чтобы можно было обратиться к ней после цикла :
            int calculationResult;

            //если i чётное:
            if(i % 2 == 0 ) {

                 calculationResult = i * i + random.nextInt(100);
            }

            //если нечётное:
            else {
                 calculationResult = i*i*i + random.nextInt();
            }


            //выводим на консоль:
            System.out.println("i = " + i + " random = " + calculationResult);

        }

    }
}
