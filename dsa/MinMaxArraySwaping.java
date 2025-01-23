package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class MinMaxArraySwaping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int minPos=0;
        int maxPos=0;
        for(int i=0;i<size;i++){
            if(nums[i]<nums[minPos]){
                minPos=i;
            }
            if(nums[i]>nums[maxPos]){
                maxPos=i;
            }

        }
        System.out.println(Arrays.toString(nums));
        int temp=nums[minPos];
        nums[minPos]=nums[maxPos];
        nums[maxPos]=temp;
        System.out.println(Arrays.toString(nums));

    }
}
