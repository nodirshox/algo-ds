package src.problems.medium;

import java.util.Arrays;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        // https://leetcode.com/problems/k-closest-points-to-origin/
        System.out.println("K Closest Points to Origin");
        int[][] input = {{3, 3}, {5,-1}, {-2,4}};
        int input2 = 2;

        int[][] output = {{3, 3}, {-2,4}};
        System.out.println(Arrays.deepToString(kClosest(input, input2)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a, b) -> returnSquaredSum(a) - returnSquaredSum(b));

        return Arrays.copyOf(points, k);
    }

    public static int returnSquaredSum(int[] a) {
        return a[0] * a [0] + a[1] * a[1];
    }
}
