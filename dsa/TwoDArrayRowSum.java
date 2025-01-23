package dsa;

import java.util.Scanner;

public class TwoDArrayRowSum {
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


        System.out.println("The sums of Matrix rows Elements:");
        for(int[]arr:mat){
            int sum=0;
            for(int a:arr){
                sum+=a;
            }
            System.out.println("The sum is:"+sum);
        }


    }
}
