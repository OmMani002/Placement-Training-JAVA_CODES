import java.util.Scanner;

public class printHandshakes {

    public static int Handshake(int n) {
        return(n*(n-1)/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Handshake(n));
    }

}
