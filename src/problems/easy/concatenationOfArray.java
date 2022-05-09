package src.problems.easy;

import java.util.Arrays;

public class concatenationOfArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/concatenation-of-array/
        System.out.println("Concatenation of Array");
        int[] input = { 1, 2, 1 };
        int[] output = { 1, 2, 1, 1, 2, 1 };

        System.out.println(Arrays.equals(getConcatenation(input), output));
    }

    public static int[] getConcatenation(int[] nums) {
        int lengthOfArray = nums.length;
        int[] newArray = new int[lengthOfArray * 2];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
            newArray[i + lengthOfArray] = nums[i];
        }

        return newArray;
    }
}
