package src.problems.easy;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
         // https://leetcode.com/problems/build-array-from-permutation/
        System.out.println("Build Array from Permutation");
        int[] input = { 0, 2, 1, 5, 3, 4 };
        int[] output = { 0, 1, 2, 4, 5, 3 };

        System.out.println(Arrays.equals(buildArray(input), output));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
