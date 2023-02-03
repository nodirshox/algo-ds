package src.problems.educative.twoPointers;

public class RemoveDuplicateInUnsortedArray {
    public int remove(int[] nums, int key) {
        int notKeyElementIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != key) {
                nums[notKeyElementIndex] = nums[i];
                notKeyElementIndex++;
            }
        }

        return notKeyElementIndex;
    }
}
