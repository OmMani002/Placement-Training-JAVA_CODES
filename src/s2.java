import java.util.*;
class s2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prev =-1;
        boolean z = true;
        while(n>0){
            int digit = n%10;
            n/=10;
            if(digit<prev) {System.out.println("not a katadrome"); z = false;
            }
            prev = digit;
        }
        if(z)System.out.println("Its a katadrome");
    }
}