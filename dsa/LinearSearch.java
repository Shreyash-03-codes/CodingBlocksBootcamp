package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Enter The Size of Array:");
        int target=sc.nextInt();
        boolean flag=true;
        for(int e:nums){
            if(e==target){
                System.out.println("Target found !!!!");
                flag=false;
            }
        }
        if(flag){
            System.out.println("Target Not Found!!!");
        }
    }
}
