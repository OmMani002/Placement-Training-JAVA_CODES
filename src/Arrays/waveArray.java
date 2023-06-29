package Arrays;

public class waveArray {
    public static void main(String [] args) {
        int n=4, m=2;
        int [][] arr = {{1,2},{3,4}, {5,6}, {7,8}};
        int b=0;

        for (int i=0; i<=m; i++) {
            if(b==0) {
                for (int j=0; j<n; j++) {
                    System.out.print(arr[j][i]);
                }
                b=n;
            } else if (b==n) {
                for (int j=n-1; j>=0; j--) {
                    System.out.print(arr[j][i]);
                }
                b=0;
            }
            System.out.println();
        }
    }
}
