package dsa;

import java.util.Arrays;

public class FibonacciMemoization {
    public static void main(String[] args) {
        int[] dp=new int[9];
        Arrays.fill(dp,-1);
        int fib=fibo(8,dp);
        System.out.println(fib);
    }
    private static int fibo(int n,int[]dp){
        if(n<2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
}
