package Leetcode;

public class MaxProfit {
    public int getMaxProfit(int[] prices) {
        int maximumProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if ((prices[i] - minPrice) > maximumProfit) {
                maximumProfit = prices[i] - minPrice;
            }
        }
        return maximumProfit;
    }
}
