package twotwosix;

import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;

        int num = sc.nextInt();
        int subset = sc.nextInt();
        int sub =subset;
        for (int i = 0; i<subset; i++) {
            if(arr[i] == num) {
                count++;
                i =subset;
                subset +=i;
                if(subset==n)break;

            }
            else {
                System.out.println("0");
            }
        }
        System.out.println(n/sub);
        System.out.println(count);
        if(count==(n/sub)) {
            System.out.println("1");
        }
    }
}
