package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
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
        System.out.println(Arrays.toString(nums));
        int start=0;
        int last=size-1;
        boolean flag=true;
        while(start<=last){
            int mid=(start+last)/2;
            if(nums[mid]==target){
                System.out.println("Element is Present!!!");
                flag=false;
                break;
            }
            else if(nums[mid]>target){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(flag){
            System.out.println("Target not found!!!");
        }
    }
}
