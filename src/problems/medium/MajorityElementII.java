package src.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        // https://leetcode.com/problems/majority-element-ii/
        System.out.println("Majority Element II");
        int[] input = { 3, 2, 3 };
        List<Integer> output = new ArrayList<Integer>();
        output.add(3);

        System.out.println(majorityElement(input));
        System.out.println(output);
    }

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int current = nums[i];

            if (values.containsKey(current)) {
                values.put(current, values.get(current) + 1);
                continue;
            }
            values.put(current, 1);
        }

        List<Integer> solution = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> set : values.entrySet()) {
            if (set.getValue() > n/3)
                solution.add(set.getKey());
        }

        return solution;
    }
}
