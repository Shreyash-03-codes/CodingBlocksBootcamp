package basics;

public class SpeedChecker {
    public static void main(String[] args){
        int speed=919;

        if(speed<=80){
            System.out.println("Safe speed hai!!!");
        }
        else if(speed>80 && speed<=100){
            System.out.println("Ye toh speed hai!!!");
        }
        else{
            System.out.println("Abe ye toh overspeed hai!!!");
        }
    }
}
