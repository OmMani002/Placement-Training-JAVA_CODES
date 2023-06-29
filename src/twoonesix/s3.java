package twoonesix;

import java.util.*;
class s3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        if(n<10)n+=10;
        for(int i =2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
                i=2;
                n=n/i;
                System.out.println(n);
            }
        }
    }
}
