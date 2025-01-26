package dsa;


import java.util.Scanner;

public class FrequencyCharacter {
    public static void main(String[] args) {

        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        str=sc.next();


        char maxChar=' ' ;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<str.length();i++){
            int count=0;
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                if(ch==c){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxChar=ch;
            }
        }

        System.out.println(maxChar+" at times "+max);


    }
}
