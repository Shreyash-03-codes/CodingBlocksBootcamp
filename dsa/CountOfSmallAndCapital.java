package dsa;
import java.util.Scanner;
public class CountOfSmallAndCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        String str=sc.next();
        int cap=0;
        int small=0;
        for(char ch:str.toCharArray()){
            if((int)ch>=65 && (int)ch<=91){
                cap++;
            }
            else{
                small++;
            }

        }
        System.out.println("The Number of Capital letters is "+cap);
        System.out.println("The Number of Small letters is "+small);
    }
}
