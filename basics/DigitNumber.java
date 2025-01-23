package basics;

import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        System.out.println("Enter The Number:");
        int num=new Scanner(System.in).nextInt();
//        System.out.println((num+"").length());
        int count=0;
        while (num != 0) {
            count++;
            num/=10;
        }
        System.out.println(count);
    }
}
