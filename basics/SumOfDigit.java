package basics;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter The Number:");
        long num=new Scanner(System.in).nextLong();
        long sum=0;
        while(num!=0){
            sum=sum+num%10;
            num/=10;
        }
        System.out.println("The the sum is:"+sum);
    }
}

