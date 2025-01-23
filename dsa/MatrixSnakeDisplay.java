package dsa;

import java.util.Scanner;

public class MatrixSnakeDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ente r The Rows of matrix:");
        int r=sc.nextInt();
        System.out.println("Enter The Rows of matrix:");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];

        System.out.println("Enter The Matrix Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        boolean flag=true;

        for(int[]arr:mat){
            if(flag){
                for(int a:arr){
                    System.out.print(a+" ");
                }
                System.out.println();
            }
            else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            flag=!flag;
        }
    }
}
