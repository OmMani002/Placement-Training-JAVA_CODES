package ZEROFIVESEVEN;
import java.util.*;

/* Find out the prime of prime numbers.*/
class s3 {
    static void primeofprime(int x, int y){

        for(int i=x;i<y;i++){
            if(isPrime(i)){
                int sum = digitsum(i);
                if(isPrime(sum)){
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if((n%i)==0 )
                return false;

        }
        return true;
    }
    public static int digitsum(int x){
        int sum=0;
        while(x>0){
            int digit = x%10;
            sum+=digit;
            x/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        primeofprime(x,y);
    }
}
