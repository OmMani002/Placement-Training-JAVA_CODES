import java.util.*;

public class s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int N = scanner.nextInt();

        // Read the array elements
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Find the maximum possible AND of the whole array
        int maxAnd = findMaxAnd(A);

        System.out.println("Maximum possible AND: " + maxAnd);
    }

    public static int findMaxAnd(int[] A) {
        int maxAnd = A[0];

        // Find the maximum element in the array
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maxAnd) {
                maxAnd = A[i];
            }
        }

        // Check the highest set bit in the maximum element
        int highestSetBit = Integer.highestOneBit(maxAnd);

        // Iterate through each bit from the highest set bit down to the least significant bit
        for (int bit = highestSetBit; bit > 0; bit >>= 1) {
            // Check if the bit is set in any element of the array
            boolean bitSet = false;

            for (int i = 0; i < A.length; i++) {
                if ((A[i] & bit) > 0) {
                    bitSet = true;
                    break;
                }
            }

            // If the bit is not set in any element, then set it in the maximum element
            if (!bitSet) {
                maxAnd |= bit;
            }
        }

        return maxAnd;
    }
}