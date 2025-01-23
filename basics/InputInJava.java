package basics;
import java.util.Scanner;
public class InputInJava {
    public static void main(String[] args) {
        System.out.println("Ek konsa bhi number dal 👇");
        int count=0;
        int num=new Scanner(System.in).nextInt();
        for(int i=0;i<=num;i++){
            if(i%5==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Itne 5 se divisible number hai 👉"+count);
    }
}
