package src.problems.educative.twoPointers;

public class SquaringSortedArray {
    public int[] squareAndSort(int[] nums) {
        int[] sorted = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sorted[i] = nums[i] * nums[i];
        }

        return sorted;
    }
}
