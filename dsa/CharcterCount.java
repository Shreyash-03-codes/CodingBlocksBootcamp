package dsa;

import java.util.Scanner;

public class CharcterCount {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        str=sc.next();
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        int count=0;
        for(char c:str.toCharArray()){
            if(c==ch){
                count++;
            }
        }
        System.out.println("The Occurence of "+ch+ " is "+count);
    }

}
