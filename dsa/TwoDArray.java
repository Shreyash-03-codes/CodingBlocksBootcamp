package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number of Rows:");
        int rows=sc.nextInt();


        int[][] mat = new int[rows][];

        for(int i=0;i<rows;i++){
            System.out.println("Enter The Number of Columns:");
            int cols=sc.nextInt();
            mat[i]=new int[cols];
        }
        int j=1;
        System.out.println("Enter The Matrix Element:");
        for(int[] arr:mat){
            System.out.println("Enter The "+arr.length+" Element for column:"+j++);
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
        }

        for(int[] arr:mat){
            System.out.println(Arrays.toString(arr));
        }


    }
}
