package ZEROFIVESEVEN;

import java.util.*;

/* I/P: 1 2 2 2 3 3 3 3 4 5
* O/P: 3 3 3 3 2 2 2 1 4 5 */
public class s1{
    public static void sort(List<Integer> list,Integer[] arr)
    {
        int n = arr.length;
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> mi = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (count.containsKey(arr[i])) {
                count.put(arr[i],
                        count.get(arr[i]) + 1);
            }
            else {
                count.put(arr[i],1);
                mi.put(arr[i],i);
            }
        }

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a,Integer b) {
                int freq1 = count.get(a);
                int freq2 = count.get(b);
                if (freq1 != freq2) {
                    return freq2 - freq1;
                }
                else {
                    return mi.get(a)- mi.get(b);
                }}});
        System.out.print(list);
    }



    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        List<Integer> list =  Arrays.asList(arr);
        sort(list,arr);
    }
}
