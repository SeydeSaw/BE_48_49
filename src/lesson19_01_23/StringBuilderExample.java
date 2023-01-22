package lesson19_01_23;
import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        String myString = "I love  Java!";

        String myString1 = "I love  Java!";

        String[] myStringArray= {myString, myString1};

        System.out.println(myStringArray);

        myString = myString + myString1 + "!!!!!";




        System.out.println(Arrays.toString(myStringArray));

        System.out.println(myString + " " + myString);

        //---------------------------StringBuffer-------

        // System.out.println("index  element "+ i + " value " + intArray[i]);    - пример конкатенации строк

        String stringLikeStringBuffer = ";" + false + ";" + 2 + ";";

        System.out.println(stringLikeStringBuffer);



        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(";");
        stringBuffer.append(false);
        stringBuffer.append(";");
        stringBuffer.append(2);
        stringBuffer.append(";");


        System.out.println(stringBuffer);



        StringBuffer stringBuffer2 = new StringBuffer("Not empty");

        System.out.println(stringBuffer2);


        ///------------------------ StringBuilder--------------


        String numbers = "0123456789";

        StringBuilder stringBuilder = new StringBuilder(numbers);

        System.out.println(stringBuilder.substring(3));
        System.out.println(stringBuilder.substring(4,8));
        System.out.println(stringBuilder.replace(3,5,"ABCDE"));






    }
}

