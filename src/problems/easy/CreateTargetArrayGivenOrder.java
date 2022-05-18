package src.problems.easy;

import java.util.Arrays;

public class CreateTargetArrayGivenOrder {
    public static void main(String[] args) {
        // https://leetcode.com/problems/create-target-array-in-the-given-order/
        System.out.println("Create Target Array in the Given Order");
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] output = { 0, 4, 1, 3, 2 };

        System.out.println(Arrays.equals(createTargetArray(nums, index), output));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            target = shiftByElement(target, index[i], nums[i]);
        }

        return target;
    }

    public static int[] shiftByElement(int[] nums, int position, int num) {
        int tempValue = num;

        for (int i = position; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = tempValue;
            tempValue = temp;
        }

        return nums;
    }
}
