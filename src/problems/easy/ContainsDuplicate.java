package src.problems.easy;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        // https://leetcode.com/problems/contains-duplicate/
        System.out.println("Contains Duplicate");
        int[] input = { 1, 2, 3, 1 };

        System.out.println(containsDuplicate(input) == true);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(values.contains(nums[i]))
                return true;

            values.add(nums[i]);
        }

        return false;
    }
}
