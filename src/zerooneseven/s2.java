package zerooneseven;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*checking if the given number is unique or not*/
public class s2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> hm =new HashMap<Integer,Integer>();

        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(hm.containsKey(a)){
                b+=hm.get(a);

            }
            hm.put(a,b);

        }
        int c=0;
        for(Map.Entry<Integer,Integer> a:hm.entrySet()){
            int b = a.getValue();

            if(b>=2) { System.out.println("Not Unique");
                c=1;
            }
        }
        if(c==0) System.out.println("Unique");
    }
}
