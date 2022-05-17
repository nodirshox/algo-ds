package src.problems.easy;

import java.util.Arrays;

public class FindGreatestCommonDivisorArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-greatest-common-divisor-of-array/
        System.out.println("Find Greatest Common Divisor of Array");
        int[] input = { 2, 5, 6, 9, 10 };
        int output = 2;

        System.out.println(findGCD(input) == output);
    }

    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (current < min)
                min = current;

            if (current > max)
                max = current;
        }

        int solution = 1;

        for (int i = max; i > 1; i--) {
            if (min % i == 0 && max % i == 0) {
                solution = i;
                break;
            }
        }

        return solution;
    }
}
