package src.problems.educative.twoPointers;

/*
* Given an array of sorted numbers and a target sum,
* find a pair in the array whose sum is equal to the given target.
* */
public class PairWithTargetSum {
    public int[] solution(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target)
                return new int[]{left, right};

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
