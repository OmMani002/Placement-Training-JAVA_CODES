import java.util.*;
class s1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int  N = n+2;
        for(int i =2;i<=N;i+=2){
            int a = i*((2*i)-1);
            System.out.println(a);
        }
    }
}