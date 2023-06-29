package twoninesix;

/* I/P: n =5
* -6 -8 10 -1 5
* subset = 2
* O/P: 48*/

import java.util.Scanner;

public class s2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int sub = in.nextInt();
        int maxprod = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i+=sub){
            int newpro =1;
            for(int j=i;j<(i+sub);){

                newpro *= arr[j];
                if(maxprod<newpro){
                    maxprod = newpro;
                }
                if(j==(n-1)){
                    break;
                }
                j++;
            }
            newpro =1;
        }
        System.out.println(maxprod);
    }
}
