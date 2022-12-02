package src.problems.easy;
import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();

        for(int num:nums) {
            if (values.contains(num)) return true;

            values.add(num);
        }

        return false;
    }
}
