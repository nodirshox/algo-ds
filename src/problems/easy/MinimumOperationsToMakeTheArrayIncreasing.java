package src.problems.easy;

import java.util.Arrays;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {
        // https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
        System.out.println("Minimum Operations to Make the Array Increasing");
        int[] input = { 1, 1, 1 };
        int output = 3;

        System.out.println(minOperations(input) == output);
    }

    public static int minOperations(int[] nums) {
        int counter = 0;

        if (nums.length < 2) return counter;

        int maxValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current > maxValue) {
                maxValue = current;
                continue;
            }

            int difference = maxValue - current + 1;
            counter += difference;
            maxValue = current + difference;
        }

        return counter;
    }
}
