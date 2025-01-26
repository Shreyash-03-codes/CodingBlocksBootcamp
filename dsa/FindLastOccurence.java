package dsa;

import java.util.Scanner;

public class FindLastOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Target:");
        int target=sc.nextInt();
        System.out.println("The last occurence of Target found at "+find(arr,0,target));
    }

    private static int find(int[]arr,int i,int target){
        if(i>=arr.length){
            return -1;
        }

        if(arr[i]==target){
            int findAgain=find(arr,i+1,target);
            return findAgain!=-1?findAgain:i;
        }
        return find(arr,i+1,target);
    }
}
