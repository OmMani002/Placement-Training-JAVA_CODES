package twoninesix;

import java.util.*;

public class s4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int  t = n;
        int sum =0;
        while(t>0){
            int digit = t%10;
            t/=10;
            sum+=digit;
        }
        if((n%sum)==0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
