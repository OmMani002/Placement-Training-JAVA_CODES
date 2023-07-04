package zerofourseven;
/**/
import java.util.Scanner;

public class s3 {
        public static void main(String[] args){
            Scanner in  = new Scanner(System.in);
            int n = in.nextInt();
            int arr[] = new int[n];
            int arr1[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            for(int i=0;i<n;i++){
                int ind =arr[i];
                arr1[ind] = i;
            }
            for(int i=0;i<n;i++){
                System.out.println(arr1[i]);
            }
        }
        }


