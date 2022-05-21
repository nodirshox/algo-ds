package src.problems.easy;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        // https://leetcode.com/problems/majority-element/
        System.out.println("Majority Element");
        int[] input = { 3, 2, 3 };
        int output = 3;

        System.out.println(majorityElement(input) == output);
    }
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

        for (int current : nums) {
            values.put(current, values.getOrDefault(current, 0) + 1);
            if (values.get(current) > length / 2)
                return current;
        }

        return -1;
    }
}
