package Top_Interview_Questions;

/**
 * Title: 121. Best Time to Buy and Sell Stock
 * <br> Difficult: Easy
 * <br> Link: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">best-time-to-buy-and-sell-stock</a>
 */
public class LeetCode121V2 {

    public int BigO = 0;

    /**
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day.
     * <br>
     * You want to maximize your profit by choosing a single day to buy one stock and
     * choosing a different day in the future to sell that stock.
     * <br> <br>
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     *
     * <br>
     * Constraints:
     * <br>
     * 1 <= prices.length <= 105
     * 0 <= prices[i] <= 104
     * <br>
     * @param prices : prices of stock
     * @return : max profit if it has
     */


    public int maxProfit(int[] prices) {
        /**
         * 1. find max profit in [a,b] => max1
         * 2. find max profit in [b+1,c] => max2
         * 3. reassign maxProfit if max2 > max1
         *
         */
        int maxProfit = 0;
        int buyPrice = prices[0];
        for(int price: prices){
            BigO++;
            if(buyPrice > price){
                buyPrice = price;
            } else if(price - buyPrice > maxProfit) {
                maxProfit = price - buyPrice;
            }
        }
        return maxProfit;
    }


}
