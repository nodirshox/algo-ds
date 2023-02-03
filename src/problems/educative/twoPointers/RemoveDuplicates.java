package src.problems.educative.twoPointers;

/*
 * Given an array of sorted numbers, remove all duplicates from it.
 * You should not use any extra space; after removing the duplicates
 * in-place return the new length of the array.
 *
 * Input: [2, 3, 3, 3, 6, 9, 9]
 * Output: 4
 * Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
 * */
public class RemoveDuplicates {
    public int solution(int[] nums) {
        if (nums.length == 0) return 0;

        int current = nums[0];
        int total = 1;

        for(int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num != current) {
                total++;
                current = num;
            }
        }

        return total;
    }

    public int remove(int[] nums) {
        int nonDuplicateElementIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[nonDuplicateElementIndex]) {
                nums[nonDuplicateElementIndex] = nums[i];
                nonDuplicateElementIndex++;
            }
        }

        return nonDuplicateElementIndex;
    }
}
