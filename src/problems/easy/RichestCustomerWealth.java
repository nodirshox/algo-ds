package src.problems.easy;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        // https://leetcode.com/problems/richest-customer-wealth/
        System.out.println("Richest Customer Wealth");
        int[][] input = { { 1, 2, 3 }, { 3, 2, 1 }};
        int output = 6;
        System.out.println(maximumWealth(input) == output);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int oneAccount = 0;

            for (int j = 0; j < accounts[i].length; j++)
                oneAccount += accounts[i][j];

            if (oneAccount > max)
                max = oneAccount;
        }

        return max;
    }
}
