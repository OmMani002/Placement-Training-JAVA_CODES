import java.io.*;

public class nearestPrime {
    static int Prime(int n) {
        if(n%2 !=0)
            n -= 2;
        else
            n--;

        if (n % 2 != 0)
            n -= 2;
        else
            n--;

        int i, j;
        for (i = n; i >= 2; i -= 2) {
            if (i % 2 == 0)
                continue;
            for (j = 3; j <= Math.sqrt(i); j += 2) {
                if (i % j == 0)
                    break;
            }
            if (j > Math.sqrt(i))
                return i;
        }
        return 2;
    }

    public static void main(String [] args) {
        int n = 51;
        System.out.println(Prime(n));
        int n1 = 12;
        System.out.println(Prime(n1));
        int n2 = 65;
        System.out.println(Prime(n2));
    }

}
