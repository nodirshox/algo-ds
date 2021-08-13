/*
    12.08.2021 - Nodirbek Ergashev
    https://leetcode.com/problems/binary-search/
*/
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            
            if (nums[mid] > target) {
                right = mid - 1;
            }
            
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}