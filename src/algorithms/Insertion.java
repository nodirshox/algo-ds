package src.algorithms;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        System.out.println("Insertion sort: O(n^2)");

        int[] input = { 12, 11, 13, 5, 6 };
        int[] output = { 5, 6,  11, 12, 13 };

        System.out.println(Arrays.equals(insertionSort(input), output));
    }
    public static int[] insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > num) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = num;
        }

        return nums;
    }
}
