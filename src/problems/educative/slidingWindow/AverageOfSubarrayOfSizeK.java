package src.problems.educative.slidingWindow;

/*
* Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
* */

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {
    public static void main(String[] args) {
        double[] result = findAverageBruteForce(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        System.out.println(Arrays.toString(result));

        double[] result2 = findAverage(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        System.out.println(Arrays.toString(result2));

        double[] result3 = slidingWindow(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        System.out.println(Arrays.toString(result3));
    }

    public static double[] slidingWindow(int[] nums, int k) {
        double[] averages = new double[nums.length - k + 1];

        double windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];

            if (windowEnd >= k - 1) {
                averages[windowStart] = windowSum / k;
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return averages;
    }

    /* total=9
    sublist=5
    1, 3, 2, 6, -1
    3, 2, 6, -1, 4
    2, 6, -1, 4, 1
    6, -1, 4, 1, 8
    -1, 4, 1, 8, 2
    * */
    public static double[] findAverageBruteForce(int[] nums, int k) {
        int totalElements = nums.length;
        double[] averages = new double[totalElements - k + 1];

        for (int index = 0; index < averages.length; index++) {
            double sum = 0;
            for (int inner = index; inner < index + k; inner++) {
                sum += nums[inner];
            }
            averages[index] = sum / k;
        }

        return averages;
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
