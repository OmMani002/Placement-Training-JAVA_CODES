package threezerosix;

//shopping problem
/* A person can take only 6 items max each time. In case he wants to buy 24 items he will have to come 4 time to purchase everything written on the list.
* Constraints: Time <4 items - 2 minutes
* >=4 items - 7 minutes*/


import java.util.*;

public class s1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(6);
        q.add(4);
        q.add(25);
        q.add(6);
        q.add(5);
        q.add(20);
        int time =0;
        int[] arr = new int[6];
        //Iterator it = q.Iterator();

        while(!q.isEmpty()){
            int a = q.poll();
            if(a<4){
                a=0;
                time+=2;

            }
            else{
                a-=6;
                time+=7;

            }
            if(a<=0){
                System.out.println(time);
            }
            else q.add(a);
        }
    }
}
