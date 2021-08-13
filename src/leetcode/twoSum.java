class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            for (int inner = index + 1; inner < nums.length; inner++) {
                if (nums[index] + nums[inner] == target) {
                    return new int[] {index, inner};
                }
            }
        }
        
        return new int[] {};
    }
}