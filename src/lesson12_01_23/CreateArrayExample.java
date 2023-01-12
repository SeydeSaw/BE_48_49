package lesson12_01_23;

import java.util.Arrays;

public class CreateArrayExample {

    public static void main(String[] args) {

        int [][] array1 = new int [3][4];

        int [][] array2 = new int [3][];

        array2[0] = new int[]{1,2,3,4,5};
        array2[1] = new int[]{6,7};
        array2[2] = new int[]{8,9,10};

        System.out.println(Arrays.deepToString(array2));

        //======

        System.out.println(Arrays.toString(array2[0]));
        System.out.println(Arrays.toString(array2[1]));
        System.out.println(Arrays.toString(array2[2]));



    }
}
