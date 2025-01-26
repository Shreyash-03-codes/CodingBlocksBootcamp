package dsa;

import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Target:");
        int target=sc.nextInt();

        int occurence=find(arr,0,target);
        System.out.println("Found at "+occurence);
    }

    private static int find(int[]arr,int i,int target){
        if(i>=arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }

        return find(arr,i+1,target);
    }
}
