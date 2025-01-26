package dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number of Tosses:");
        int n=sc.nextInt();

        ArrayList<String> list=new ArrayList<>();
        permute(n,"",list);
        System.out.println(list);
    }
    private static void permute(int n,String str,ArrayList<String>list){
        if(n<=0){
            list.add(str);
            return;
        }

        permute(n-1,str+"H",list);
        permute(n-1,str+"T",list);


    }
}
