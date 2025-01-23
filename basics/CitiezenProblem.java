package basics;

public class CitiezenProblem {
    public static void main(String[]args){
        int age=30;

        if(age<=20){
            System.out.println("Bachha hai yar!!!");
        }
        else if(age>20 && age<=50){
            System.out.println("Men hai yaar!!!");
        }
        else if(age>50 && age<=70){
            System.out.println("Old mhai yaar!!");
        }
        else {
            System.out.println("Ye toh legend hai yaar!!!");
        }
    }
}
