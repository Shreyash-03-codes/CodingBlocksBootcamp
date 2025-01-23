package basics;
public class ArmStrongNumber {
    public static void main(String[] args) {
        int count=0;
        for(int i=11;i<=10000;i++) {
            int num=i;
            long n = num;
            long rev = 0L;
            long p = (num + "").length();
            while (num != 0) {
                long rem = num % 10;
                rev = rev + getSum(rem, p);
                num /= 10;
            }
         if (rev == n) {
                System.out.println(i+" is Armstrong Number!!!");
                count++;
            }
        }
        System.out.println(count);

    }
   private static long getSum(long num,long pow){
        return (long)Math.pow(num,pow);
    }
}
