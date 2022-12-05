package src.problems.educative.twoPointers;

/*
Given an array of sorted numbers and a target sum, find a pair
in the array whose sum is equal to the given target.
 */
public class SimpleQuestion {
    public boolean bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;

                int num1 = nums[i];
                int num2 = nums[j];

                if (num1 + num2 == target)
                    return true;
            }
        }

        return false;
    }
}
