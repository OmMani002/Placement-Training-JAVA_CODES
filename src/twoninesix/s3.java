package twoninesix;

/* IP Decimal Input then converts it to binary then the Output should be swap of the binary number.
* For example 100
* 01100100
*
* O/P: 01000110*/

import java.util.*;

public class s3 {
    public static void decToBinary(int n)
    {
        int[] binaryNum = new int[32];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        if((i%2)!=0){
            i+=1;}
        int k = i/2;
        for(int j=0;j<i/2;j++){
            int temp = binaryNum[j];
            binaryNum[j] = binaryNum[j+k];
            binaryNum[j+k]=temp;
            System.out.println();
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int  n =in.nextInt();
        decToBinary(n);
    }
}
