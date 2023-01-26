package lesson23_01_23;

public class Task3Test {

    public static void main(String[] args) {


        Task3Util task3Util = new Task3Util();

    int arraySize = 12;
    int startValue = -15;
    int endValue = 15;

        // на что мы делаем тесты:
        //1. Правильность создания массива
        //2. Поиск максимального элемента
        //3. Поиск индекса последнего вхождения

        int[] expectedArray = new int[12];

        int[] realArray = task3Util.createArray(arraySize);

        if( expectedArray.length == realArray.length){
            System.out.println();
        }
    }

    public static void printTestResult( int expectedResult, int realResult){
        if(expectedResult == realResult){
            System.out.println("test passed ok");
        }
        else {
            System.out.println("test passed fail");
        }
    }
}
