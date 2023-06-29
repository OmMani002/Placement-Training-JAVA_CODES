package twothreesix;

//Trendy Number Program

import java.util.*;
class s2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<3;i++){
            int digit = n%10;
            n/=10;
            if((i==1)&&((digit%3)==0)){
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}

