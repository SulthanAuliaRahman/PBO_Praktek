

public class MathUtils{
    public static int factorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Undefined");
        }
        if (n > 16) {
            throw new IllegalArgumentException("overflow,nilai terlalu besar");
        }
        int fac = 1;
        for (int i=n; i>0; i--){
            fac *= i;
        }
        return fac;
    }
}