package Arrays;

import java.io.*;

public class twoDArrays {
    static int N = 3;

    static void cross(int mat1[][], int mat2[][], int result[][]) {
        int i, j, k;
        for(i=0; i<N; i++) {
            for (j=0; j<N; j++) {
                result[i][j] = 0;
                for (k=0; k<N; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat1 = {{1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3}};
        int[][] mat2 = {{1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3}};

        int result[][] = new int[N][N];
        int i, j;
        cross(mat1, mat2, result);
        System.out.println("Result matrix" + "is");

        for (i =0; i<N; i++) {
            for (j=0; j<N; j++) {
                System.out.println(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
