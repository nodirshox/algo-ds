package src.problems.easy;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/running-sum-of-1d-array/
        System.out.println("Running Sum of 1d Array");
        int[] input = { 1, 2, 3, 4 };
        int[] output = { 1, 3, 6, 10 };
        System.out.println(Arrays.equals(runningSum(input), output));
    }
    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            output[i] = total + nums[i];
            total += nums[i];
        }

        return output;
    }
}
