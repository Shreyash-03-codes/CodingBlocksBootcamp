package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class PowerArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        int[] power=new int[size];
        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            power[i]=(i+1)*nums[i];
            sum+=(i+1)*nums[i];
        }
        System.out.println(Arrays.toString(power));
        System.out.println(sum);
    }
}
