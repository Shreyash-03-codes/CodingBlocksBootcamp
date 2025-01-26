package dsa;

public class FibbonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    private static int fibo(int n){
        return n<2?n:fibo(n-1)+fibo(n-2);
    }
}
