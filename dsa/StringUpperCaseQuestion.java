package dsa;

import java.util.Scanner;

public class StringUpperCaseQuestion {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        String str=sc.next();

        for(char ch:str.toCharArray()){
            if(ch>=65 && ch<=90){
                System.out.print(ch);
            }
        }
    }
}
