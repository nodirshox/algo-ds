package src.problems.easy;

import java.util.HashMap;

public class ContainsDuplicateTwo {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> list = new HashMap<>();

        for(int index = 0; index < nums.length; index++) {
            int num = nums[index];

            if (list.containsKey(num) && Math.abs(list.get(num) - index) <= k) {
                return true;
            }

            list.put(num, index);
        }
        return false;
    }
}
