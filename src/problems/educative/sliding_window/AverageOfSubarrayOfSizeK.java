package src.problems.educative.sliding_window;

/*
* Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
* */

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {
    public static void main(String[] args) {
        double[] result = findAverage(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        System.out.println(Arrays.toString(result));
    }

    public static double[] findAverage(int[] nums, int k) {
        double[] averages = new double[nums.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];

            if (windowEnd >= k - 1) {
                averages[windowStart] = windowSum / k;
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return averages;
    }
}
