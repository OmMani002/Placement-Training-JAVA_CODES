package twoonesix;

import java.util.Scanner;

public class reverseNumber {
    public static void revNum(int num) {
        if(num<10) {
            System.out.println(num);
            return;
        }
        else {
            System.out.println(num % 10);
            revNum(num/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        revNum(num);
    }
}
