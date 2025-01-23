package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=sc.nextInt();

        int[] nums=new int[size];
        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter The Target:");
        int target=sc.nextInt();

        Arrays.sort(nums);

        int left=0;
        int right=size-1;

        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                System.out.println(left+" and "+right);
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
