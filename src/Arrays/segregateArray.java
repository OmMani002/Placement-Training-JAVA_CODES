// Java code to Segregate 0s and 1s in an array
package Arrays;

public class segregateArray {
    static void segregate0and1(int arr[], int n)
    {
        // Counts the no of zeros in array
        int count = 0;

        // Iteration over array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
        for (int i = 0; i < count; i++)
            arr[i] = 0;
        for (int i = count; i < n; i++)
            arr[i] = 1;
    }
    static void print(int arr[], int n)
    {
        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        int arr[] = new int[] { 0, 1, 0, 1, 0};
        int n = arr.length;
        segregate0and1(arr, n);
        print(arr, n);
    }
}
