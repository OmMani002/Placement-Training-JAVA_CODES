package ZEROFIVESEVEN;

import java.util.*;
public class s2 {
    static int max(int [][]mat,int R,int C)
    {
        if (R < 3 || C < 3){
            System.out.println("Not possible");
            System.exit(0);
        }


        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < R - 2; i++)
        {
            for (int j = 0; j < C - 2; j++)
            {
                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);

                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] =in.nextInt();
            }

        }
        System.out.println(max(arr,n,n));
    }
}