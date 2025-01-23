package dsa;

import java.util.Scanner;

public class SumArrayElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
       if((size^1)==size-1){
           System.out.println("The size is ODD ");
       }
        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int sum=0;
        for(int a:nums){
            sum+=a;
        }
        System.out.println("The Sum of Array elements:"+sum);
    }
}
