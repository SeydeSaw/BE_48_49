package lesson9;

/*todo======== lesson8.Task_6.txt ========

Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */

public class CompareNumbers {

    double num1;
    double num2;

    public double compare(){
        if(num1<num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    public void printInfo(double compareResult){
        System.out.println("========");
        System.out.println("Lesser number is: " + compareResult);
    }



}
