package basics;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=1000){
            if(i%7==0 && i%5==0){
                System.out.println(i);;
            }
            i++;
        }
    }
}
