package src.problems.medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        // https://leetcode.com/problems/sort-colors/
        System.out.println("Sort Colors");
        int[] input = { 2, 0, 2, 1, 1, 0 };
        int[] output = { 0, 0, 1, 1, 2, 2 };

        System.out.println(Arrays.equals(sortColors(input), output));
    }
    public static int[] sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > num) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = num;
        }

        return nums;
    }
}
