package twotwosix;

//I/P: a3b4c5
//O/P: aaabbbbccccc

import java.util.Scanner;

public class s2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int j =0;
        try{
            int[] a = new int[40];
            String[] str1 = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            for(int i =0;i<=str1.length;i++){
                for(j=0;j<Integer.parseInt(str1[i+1]);j++){
                    System.out.print(str1[i]);
                }
                i+=1;
                j=0;
            }
            System.out.println();
        }
        catch(Exception e){}
    }
}