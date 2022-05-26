package src.problems.easy;

import java.util.HashMap;

public class CountEqualAndDivisiblePairsArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
        System.out.println("Count Equal and Divisible Pairs in an Array");
        int[] input = { 3, 1, 2, 2, 2, 1, 3 };

        System.out.println(countPairs(input, 2) == 4);
    }

    public static int countPairs(int[] nums, int k) {
        int counter = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j< nums.length; j++) {
                if (i < j && nums[i] == nums[j] && (i * j) % k == 0)
                    counter++;
            }
        }

        return counter;
    }
}
