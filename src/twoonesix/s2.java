package twoonesix;

import java.util.*;
class s2 {
    public static boolean abc(String a,String b){
        int l1 = a.length();
        int l2 = b.length();

        if(l1!=l2) return false;

        int[] arr = new int[20];
        for(int i = 0 ; i<l1;i++){
            arr[a.charAt(i)-48]++;
        }
        for(int i =0 ; i<l2;i++){
            arr[b.charAt(i)-48]--;
            if(arr[a.charAt(i)-48]<0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(abc(a,b));
    }
}