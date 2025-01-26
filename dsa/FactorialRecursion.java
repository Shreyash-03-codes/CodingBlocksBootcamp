package dsa;

public class FactorialRecursion {
    public static void main(String[]args){
        System.out.println("The Factorial of "+5+" is "+fact(5));
    }

    private static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n*fact(n-1);
    }
}
