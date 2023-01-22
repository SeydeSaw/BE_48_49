package hw_BE_48_49m.hw_19_01_23;
/* 3.
Дано два числа, например 3 и 56, значение которых хранятся в переменных.
a)Необходимо составить следующие текстовые строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используйте метод StringBuilder.append().
b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
c)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */
public class StringBuilderHw {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 56;

                    // a) составление текстовых строк:

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(num1);
        stringBuilder.append(" + ");
        stringBuilder.append(num2);
        stringBuilder.append(" = ");
        stringBuilder.append(num1+num2);
        stringBuilder.append("\n"); // для перехода на следующую строку

        //==============

        stringBuilder.append(num1);
        stringBuilder.append(" - ");
        stringBuilder.append(num2);
        stringBuilder.append(" = ");
        stringBuilder.append(num1-num2);
        stringBuilder.append("\n"); // для перехода на следующую строку

        //=============

        stringBuilder.append(num1);
        stringBuilder.append(" * ");
        stringBuilder.append(num2);
        stringBuilder.append(" = ");
        stringBuilder.append(num1*num2);
        stringBuilder.append("\n"); // для перехода на следующую строку

        System.out.println(stringBuilder);


                //  b) Замена символа “=” на слово “равно” :

        for (int i = 0; i < stringBuilder.length(); i++) { // Перебор элементов массива
            if (stringBuilder.charAt(i) == '=') { // Проверка, есть ли такой элемент в массиве
                stringBuilder.deleteCharAt(i);
                stringBuilder.insert(i, " равно ");
            }
        }
        System.out.println(stringBuilder);

               //  c) Замена символа “=” на слово “равно” :

        //Вариант 1
        //Если не отменять цикл в условии "b", то использую эти индексы для замены:

        System.out.println(stringBuilder.replace(7,14," равно "));

        //Вариант 2
        //Если закомментировать до этого цикл в условие "b", то используем эти индексы для замены:

//        stringBuilder.replace(6,8," равно ");
//        stringBuilder.replace(23,26," равно ");
//        stringBuilder.replace(40,43," равно ");
//
//        System.out.println(stringBuilder);

    }
}
