package Arrays;//WRT a program to find the unique elements in an Array.

import java.util.Arrays;
import java.util.Scanner;

public class uniqueArrayElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4, 5, 7, 7, 7, 9, 10, 10};

        Arrays.sort(arr);

        int one = arr.length;

        int arr1[] = new int[30];

        int index = 0;

        for (int i =0; i<one; i++) {
            while (i<one-1 && arr[i] == arr[i+1])
                i++;

            arr1[index] = arr[i];
            index++;
        }

        for (int i=0; i<index; i++) {
            System.out.println(arr1[i] + " ");
        }
    }
}
