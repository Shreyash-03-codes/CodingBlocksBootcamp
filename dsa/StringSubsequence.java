package dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        String str=sc.next();
        ArrayList<String> list=new ArrayList<>();
        subSequence(str,"",0,list);
        System.out.println(list);

    }

    private static void subSequence(String s,String str,int i,ArrayList<String> list){
        if(i>=s.length()){
            list.add(str);
            return;
        }

        subSequence(s,str+s.charAt(i),i+1,list);
        subSequence(s,str,i+1,list);


    }
}
