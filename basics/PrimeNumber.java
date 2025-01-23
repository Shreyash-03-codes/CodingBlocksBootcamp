package basics;

public class PrimeNumber {
    public static void main(String[] args) {

        int count=0;

        for(int j=2;j<=10000;j++) {
            boolean flag = true;
            for (int i = 2; i <= (j / 2); i++) {
                if (j % i == 0) {

                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(j);
                count++;
            }
        }
        System.out.println("The Total count is "+count);
    }
}
