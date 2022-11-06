package src.problems.easy;

public class Stock {
    public static void main(String[] args) {
        int[] input = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(input));
    }
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int maxProfit = 0;

        while(right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
