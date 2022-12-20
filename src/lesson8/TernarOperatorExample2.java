package lesson8;

/*todo Задача :
   реализовать метод, который принимает число и проверяет его:
   если число целое, то возвращает квадрат этого числа
   иначе - возвращает 0
*/




public class TernarOperatorExample2 {
    public static void main(String[] args) {
        System.out.println(checkNumber(20.005));
        System.out.println(checkNumber(10.0));

        System.out.println(checkNumber2(20.005));
        System.out.println(checkNumber2(10.0));

    }


    //todo==== Способой 1 , используюя if  else  : ====
    public static int checkNumber (double number){
//       в переменную int =  берем целую часть от числа:
        int checkMainPart = (int) (number);

//присвоение переменной остаток = число -  остаток от числа
        double ostatok = number - checkMainPart;

        //если остаток равен 0 , то
        if(ostatok == 0){
            //вернуть квадрат числа
            return checkMainPart * checkMainPart;
        }
        else {
            //иначе 0
            return 0;
        }

    }

    //todo=== второй способ прописи, не использую If  else: ==

    public static int checkNumber2 (double number){
//       в переменную int =  берем целую часть от числа:
        int checkMainPart = (int) (number);


        double ostatok = number - checkMainPart;

        int resultForReturn = ostatok == 0 ? checkMainPart * checkMainPart: 0;

        return resultForReturn;

    }

}
