package lesson7;

public class QuickMath {
    public int sum (int x, int y){
        return (x + y);
    }

    public int minus (int x, int y){
        return (x - y);
    }

    public int result (int x, int y){
        return (sum(x,y) * minus(x,y));
    }

}
