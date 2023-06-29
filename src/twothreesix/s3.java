package twothreesix;

import java.util.*;
class s3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int add=0;int sum =0;
        int n = 99;
        for(int i = 11; i<=n; i++){
            int num = i;
            for(int j=0;j<=2;j++){
                int digit = num%10;
                num/=10;
                sum+=digit;
                add=digit;
                if((sum+add)==i){System.out.println(i);
                }
            }
            add=0;
            sum=0;
        }
    }
}
