package basics;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter The Name:");
        long num=new Scanner(System.in).nextLong();
        if(num<0){
            System.out.println("Number is not Pallindrome");
            return;
        }
        long n=num;
        long rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        if(rev==n){
            System.out.println("Number is Pallindrome");
        }
        else{
            System.out.println("Number is not Pallindrome");
        }
    }
}
