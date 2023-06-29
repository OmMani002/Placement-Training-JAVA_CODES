//Write a program to print hollow square

// * * *
// *   *
// * * *
import java.util.Scanner;

public class hollowSquare {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("Enter no of sides Side = ");
        int side = sc.nextInt();

        System.out.println("Hollow Square Pattern");

        for (int i = 0; i < side; i++ ) {
            for (int j = 0 ; j < side; j++ ) {
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
