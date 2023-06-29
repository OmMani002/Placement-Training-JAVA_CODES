import java.util.*;
class Main{
    public static void primepair(int L,int R, int K){
        int count =0;
        for(int i=L;i<=R;i++ ){
            if((isPrime(i))&&(isPrime(i+K))){
                count ++;
            }

            System.out.println(count);
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if((n%i)==0 )return false;

        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        primepair(l,k,r);
    }
}