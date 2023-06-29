package twoEightSix;

/*Write a function smallLargeSum (array) which accepts the array as an argument, that performs the addition of the second-largest
element from the even location with the second-largest element from an odd location.
I/P: 6(size of array) 3 2 1 7 5 4
O/P: 7*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class s1 {
    public static int smallLargeSum(int arr[]) {
        ArrayList <Integer> even = new ArrayList<Integer>();
        ArrayList <Integer> odd = new ArrayList<Integer>();
        even.add(arr[0]);

        for (int i = 1; i<arr.length; i++) {
            if (i % 2 == 0){
                even.add(arr[i]);
            }
            else {
                odd.add(arr[i]);
            }
        }
        Collections.sort (even);
        Collections.sort (odd);

        return even.get(even.size() - 2) + odd.get(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(smallLargeSum(arr));
    }
}
