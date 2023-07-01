package zerooneseven;

import java.util.*;
public class s3 {
    public static void main(String args[]){
        Map <Integer,Integer> hm = new HashMap<Integer,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum =0;
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            sum += ((b/50)+1);
            if(hm.containsKey(a)){
                b+=hm.get(a);

            }
            hm.put(a,b);



        }

        System.out.println(sum);
        sum =0;

        for(Map.Entry<Integer,Integer> a:hm.entrySet()){
            int b = a.getValue();

            sum += ((b/50)+1);
        }
        System.out.println(sum);



    }
}
