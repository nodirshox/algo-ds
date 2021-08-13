package problems.easy;
/*
    13.08.2021 - Nodirbek Ergashev
    https://leetcode.com/problems/single-number/
*/

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> all = new HashSet<Integer>();

        for (int index = 0; index < nums.length; index++) {
            if (all.contains(nums[index])) {
                all.remove(nums[index]);
            } else {
                all.add(nums[index]);
            }
        }
        TreeSet sortedSet = new TreeSet<Integer>(all);
        
        return (Integer)sortedSet.first();
    }
}