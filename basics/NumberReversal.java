package basics;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        System.out.println("Enter The Name:");
        long num=new Scanner(System.in).nextLong();

        long rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println("The Reversed Number is:"+rev);
    }
}
