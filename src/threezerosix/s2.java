package threezerosix;

import java.util.Scanner;

/**/
class s2{
    public static int digits(int n){
        while(n>0){
            int digit = n%10;
            n/=10;
            if((digit==1)||(digit==4)||(digit==9)){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int a =in.nextInt();
        for(;a<=n;a++){
            if(digits(a)==1) System.out.println(a);
        }
    }

}
