package src.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-all-duplicates-in-an-array/
        System.out.println("Find All Duplicates in an Array");
        int[] input = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> output = new ArrayList<Integer>();
        output.add(2);
        output.add(3);

        System.out.println(findDuplicates(input));
        System.out.println(output);
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<Integer>();

        HashSet<Integer> uniques = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (uniques.contains(current)) {
                duplicates.add(current);
            } else {
                uniques.add(current);
            }
        }

        return duplicates;
    }
}
