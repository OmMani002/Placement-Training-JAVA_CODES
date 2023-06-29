package twoonesix;

import java.util.*;
class s1{
    public static int reverseNumber(int n)
    {
        int rev=0;
        int i  = 0;
        if((n<=0)||(n>=1000000)) {
            System.out.println("Wrong Input");
            return -1;
        }
        else{
            while(n>0){
                int digit = n%10;
                rev = rev + (9-digit) * (int)Math.pow(10, i++);
                n = n/10;
//                System.out.println(n);
//                System.out.println(i);
            }
            return rev;
        }

    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverseNumber(n));
    }
}
