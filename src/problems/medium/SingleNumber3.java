package src.problems.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber3 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/single-number-iii/
        System.out.println("Single Number III");
        int[] input = { 1,2,1,3,2,5 };
        int[] output = { 3, 5 };

        System.out.println(Arrays.equals(singleNumber(input), output));
    }
    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> appearedTwice = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (appearedTwice.containsKey(current)) {
                appearedTwice.put(current, 2);
            } else {
                appearedTwice.put(current, 1);
            }
        }
        int[] solution = new int[2];
        boolean isSet = false;
        for(Map.Entry<Integer, Integer> set : appearedTwice.entrySet()) {
            if (set.getValue() == 1) {
                if (!isSet) {
                    solution[0] = set.getKey();
                    isSet = true;
                } else {
                    solution[1] = set.getKey();
                }
            }
        }

        return solution;
    }
}
