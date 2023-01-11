package lesson11_01_23;

import java.util.Arrays;

public class ArrayExample3 {
//todo
// Двухмерный массив:

    public static void main(String[] args) {

        int [][] twoDimArray = new int[3][4];//3 строки, 4 столбика

        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 4;

        twoDimArray[1][0] = 5;
        twoDimArray[1][1] = 6;
        twoDimArray[1][2] = 7;
        twoDimArray[1][3] = 8;

        twoDimArray[2][0] = 9;
        twoDimArray[2][1] = 10;
        twoDimArray[2][2] = 11;
        twoDimArray[2][3] = 12;


        System.out.println(Arrays.deepToString(twoDimArray));

        //первый индекс - количество строк:
        System.out.println(twoDimArray.length);

        //второй индекс - количество столбцов в строке:
        System.out.println(twoDimArray[0].length);

        //прошли в цикле от 0 до размера строк:
        for (int i = 0; i < twoDimArray.length; i++) {
            //прошли внутри каждой строки по количеству элементов:
            for (int j = 0; j < twoDimArray[0].length; j++) {
                System.out.println("Element " + i + " line, " + j + " colum is : " + twoDimArray[i][j]);
            }
        }
    }
}
