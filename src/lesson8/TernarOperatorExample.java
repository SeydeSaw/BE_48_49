package lesson8;

public class TernarOperatorExample {
    public static void main(String[] args) {
        System.out.println(absolute(10));
        System.out.println(absolute(-10));





    }

    public static int absolute (int number){
        if(number>=0){
            return number;
        }
        else {
            return -number;//отбрасывает минус
        }
    }

    public static int absolute2 (int number){
        //условие ? выражение если положительно : выражение если отрицательно

        //если число >= 0 , то верни число, в противном случае верни -число
        int result = number>=0 ? number : -number;
        return result;
    }


}
