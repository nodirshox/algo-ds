class Solution {
    public int[] runningSum(int[] nums) {
        int tempSum = 0;
        for (int index = 0; index < nums.length; index++) {
            tempSum += nums[index];
            nums[index] = tempSum;
        }
        
        return nums;
    }
}