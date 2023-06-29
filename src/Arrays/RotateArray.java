package Arrays;

import java.util.*;

import static java.util.Arrays.*;

public class RotateArray {
     public static void rotate(int arr[], int i, int d, int n) {
         if (d == 0 || d == n)
             return;
         if (d == n - d) {
             swap(arr, i, n - d + i, d);
         return;
     }
        if(d<n-d) {
         swap(arr, i, n-d+i, d);
         rotate(arr, i, d, n-d);
        }

        else {
            swap(arr, i, d, n-d);
            rotate(arr, n-d, (2*d)-n, d);
        }
     }

     public static void dRotate(int arr[], int d, int n) {
         rotate(arr, 0, d, n);
     }
    public static void swap(int[] arr, int i, int d, int n) {
         int temp;
            for (int j=0; j<=n; j++) {
                temp = arr[i+1];
                arr[i+1] = arr[d+1];
                arr[d+1] = temp;
            }
         }

    public static void main(String [] args) {
         int arr1[] = {1, 2, 3, 4, 5, 6};
         dRotate(arr1,3, 5);
         for(int i=0; i<arr1.length; i++) {
             System.out.print(arr1[i]);
         }
    }

}
