package twotwosix;

import java.util.Scanner;

public class s1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<10) {
            n+=10;
        }
        for (int i=2; i<=n; i++) {
            if(n%i==0) {
                System.out.println(i + ",");
                n = n/i;
                i =2;
            }
        }
    }
}
