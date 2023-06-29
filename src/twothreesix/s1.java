package twothreesix;

import java.util.*;
class s1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Queue<Integer> a = new LinkedList<Integer>();
        a.add(in.nextInt());
        a.add(in.nextInt());
        a.add(in.nextInt());
        a.add(in.nextInt());
        a.add(in.nextInt());
        a.add(in.nextInt());
        sort(a);
        while(a.isEmpty()== false)
        {
            System.out.print(a.peek() + " ");
            a.poll();
        }
    }
    public static int indexmin(Queue <Integer> a, int indx){
        int minval = Integer.MAX_VALUE;
        int minindx = -1;
        int n = a.size();
        for(int i =0;i<n;i++){
            int current = a.peek();
            a.poll();
            if (current <= minval && i <= indx)
            {
                minindx = i;
                minval= current;
            }
            a.add(current);
        }
        return minindx;
    }
    public static void insert(Queue<Integer> a, int indx){
        int minval = 0;
        int n = a.size();
        for (int i = 0; i < n; i++)
        {
            int current = a.peek();
            a.poll();
            if (i != indx)
                a.add(current);
            else
                minval = current;
        }
        a.add(minval);
    }
    public static void sort(Queue<Integer> a){
        for(int i=1;i<=a.size();i++){
            int min = indexmin(a,a.size()-i);
            insert(a,min);
        }
    }
}
