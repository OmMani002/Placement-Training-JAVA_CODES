import java.util.*;
import java.util.Scanner;

public class sumOfDigit {
    public static int sum (int n) {
        int s = 0;
        for (int i=0; i<9999999; i++) {
            int digit=n%10;
            n/=10;
            s+=digit;
            if(digit==0) break;
        }
        return s;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i =0; a>= 10; i++) {
            a = sum(a);

        }
        System.out.println(a);
    }
}
