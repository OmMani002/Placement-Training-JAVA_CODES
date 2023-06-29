package twoonesix;

import java.util.Scanner;

// Automorphic number is a number when we do a square of it, the square gives the same number at the end.


public class numberAutomorphic {
    static boolean NumAuto(int N) {
        if(N>0) {
            N= -N;
        }
        int sq = N*N;
        while (N>0) {
            if(N%10 != sq %10) {
                return false;
            }
            N /= 10;
            sq /= 10;
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(NumAuto(N));
    }
}
