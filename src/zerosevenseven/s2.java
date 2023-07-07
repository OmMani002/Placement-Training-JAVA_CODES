package zerosevenseven;

/* Print the following Pattern
* I/P: 7
* O/P: 1
*      1 1
*      1 0 1
*      1 1 1
*
* Done with the Binary String.*/

import java.util.*;
public class s2 {
    public static void intPattern(int n) {
        String binaryNum ="";
        for (int i = 1; i <= n; i++) {
            if((i%2)!=0){
                binaryNum = Integer.toBinaryString(i);

                System.out.println(binaryNum);}
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        intPattern(n);
    }
}


