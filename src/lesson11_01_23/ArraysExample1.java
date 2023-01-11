package lesson11_01_23;

public class ArraysExample1 {

    public static void main(String[] args) {

        //создаём экзэмпляр класса:
        ArrayOperationsExample arrayOperationsExample = new ArrayOperationsExample();

        InputArray inputArray = new InputArray();

        PrintArrayInfo printArrayInfo = new PrintArrayInfo();

        //===

        int [] workingArray = inputArray.userInput();
        // вызываем метод
        int sum = arrayOperationsExample.sumOfArrayElement(workingArray);

        int min = arrayOperationsExample.minOfArrayElement(workingArray);

        int max = arrayOperationsExample.maxOfArrayElement(workingArray);

        printArrayInfo.arrayPrint("Our array: ", workingArray);
        System.out.println("Sum of array elements is : " + sum);
        System.out.println("Min of array elements is : " + min);
        System.out.println("Max of array elements is : " + max);


    }
}
