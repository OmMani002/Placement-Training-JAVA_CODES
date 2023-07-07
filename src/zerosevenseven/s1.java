package zerosevenseven;

/* print the following pattern
* H       o
*   e   l
*     l
*   e   l
* H       o*/

import java.util.*;
public class s1 {
    static void helloPattern(String str, int len)
    {

        for (int i = 0; i < len; i++) {
            int j = len - 1 - i;
            for (int k = 0; k < len; k++) {
                if (k == i || k == j)
                    System.out.print(str.charAt(k));
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        String s = in.nextLine();
        helloPattern(s,s.length());

    }
}
