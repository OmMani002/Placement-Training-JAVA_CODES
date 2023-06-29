import java.util.*;
class s3{
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int num = in.nextInt();
            if(digit(num)) arr[i] = num;
            else arr[i] = 0;

        }
        Arrays.sort(arr);
        System.out.println(largest(arr));
    }
    public static boolean digit(int n){
        while(n>0){
            int digit = n%10;
            n/=10;
            if(digit==9){
                return false;
            }
        }
        return true;
    }
    public static int largest(int[] arr){
        int largest = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                largest = arr[i-1];

            }else
                largest = arr[i];
        }
        return largest;
    }
}