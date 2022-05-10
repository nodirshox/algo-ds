package src.problems.easy;

import java.util.Arrays;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        // https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
        System.out.println("Final Value Of Variable After Performing Operations");

        String[] input = { "--X", "X++", "X++" };
        int output = 1;

        System.out.println(finalValueAfterOperations(input) == output);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        String inc1 = "++X";
        String inc2 = "X++";

        String dec1 = "--X";
        String dec2 = "X--";

        for (int i = 0; i < operations.length; i++) {
            String current = operations[i];
            if (current.equals(inc1) || current.equals(inc2))
                result += 1;

            if (current.equals(dec1) || current.equals(dec2))
                result -= 1;
        }

        return result;
    }
}
