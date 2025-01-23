package dsa;

import java.util.Scanner;

public class UserInputArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }

        int even=0;
        int odd=0;
        for(int a:nums){
            if(a%2==0){
                even++;
                System.out.println(a);
            }
            else{
                odd++;
                System.out.println(a);
            }
        }
        System.out.println("The Number of Even NUmbers "+even);
        System.out.println("The Number of Odd NUmbers "+odd);

    }
}
