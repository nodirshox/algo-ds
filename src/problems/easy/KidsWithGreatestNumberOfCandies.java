package src.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
        System.out.println("Kids With the Greatest Number of Candies");
        int[] input = { 2,3,5,1,3 };
        int input2 = 3;
        boolean[] output = { true, true, true, false, true };

        System.out.println(kidsWithCandies(input, input2));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        List<Boolean> solution = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                solution.add(true);
            } else {
                solution.add(false);
            }
        }

        return solution;
    }
}
