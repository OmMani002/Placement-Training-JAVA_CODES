package zerofourseven;

/* Sort the array, in which the first three terms of the array will come in an Ascending order and the rest three will come in Descending order
 * I/P: 1 7 9 8 5 4
 * O/P: 1 4 5 9 8 7*/


import java.util.Arrays;
public class s1 {
    static void reverseSort(int[] arr, int n){

        Arrays.sort(arr);

        for (int i =0; i<n/2; i++){
            System.out.println(arr[i] + " ");
        }
        for (int j = n-1; j>=n/2; j--){
            System.out.println(arr[j]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 8, 5, 4};
        int n = arr.length;
        reverseSort(arr, n);
    }
}
