import java.util.*;

public class AncientCivilization {
    private static int[] parent;
    private static int[] values;
    private static int[] blockBeauty;

    public static int[] findBlockBeauty(int[] A, int[][] links, int[] D) {
        int N = A.length;
        int M = links.length;
        int K = D.length;

        // Initialize arrays
        parent = new int[N];
        values = A;
        blockBeauty = new int[N];
        Arrays.fill(blockBeauty, -1); // Initialize blockBeauty with -1 (invalid value)

        // Create disjoint sets for objects
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }

        // Link objects based on given connections
        for (int i = 0; i < M; i++) {
            int u = links[i][0];
            int v = links[i][1];
            union(u, v);
        }

        // Calculate block beauty before object disappearance
        int[] result = new int[K];
        for (int i = 0; i < K; i++) {
            int objIndex = D[i];
            result[i] = calculateMaxBlockBeauty(objIndex);
        }

        return result;
    }

    private static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    private static void union(int x, int y) {
        int parentX = find(x);
        int parentY = find(y);
        parent[parentY] = parentX;
    }

    private static int calculateMaxBlockBeauty(int objIndex) {
        int maxBeauty = 0;
        int parentObj = find(objIndex);
        for (int i = 0; i < parent.length; i++) {
            if (find(i) == parentObj) {
                maxBeauty ^= values[i];
            }
        }
        return maxBeauty;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 9, 5};
        int[][] links = {{0, 2}, {0, 1}, {2, 3}};
        int[] D = {0, 3};

        int[] blockBeauty = findBlockBeauty(A, links, D);

        System.out.println("Block Beauty:");
        for (int beauty : blockBeauty) {
            System.out.println(beauty);
        }
    }
}