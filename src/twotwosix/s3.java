package twotwosix;

import java.util.Scanner;

public class s3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s  = in.nextLine();
        String s1  = in.nextLine();
        String s2 = "";
        int j=0;
        for(int i =0 ;i<s1.length();i++){
            char ab = s1.charAt(i);
            for( j =0 ;j<s.length();j++){
                if(s.charAt(j) == ab){
                    s2 = charRem(s,j);
                    j = j-1;
                }
                //System.out.println(s2);
                if(s2!=""){
                    s = s2;

                }
            }
            j=0;
        }
        System.out.println(s);
    }
    public static String charRem(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}
