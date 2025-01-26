package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class EveryCharacterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        String str=sc.next();

        int [] chars=new int[26];

        for(char ch:str.toCharArray()){
            chars[ch-'a']++;
        }

        System.out.println(Arrays.toString(chars));
    }
}
