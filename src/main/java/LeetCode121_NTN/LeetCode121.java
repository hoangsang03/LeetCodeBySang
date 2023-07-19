package LeetCode121_NTN;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:
 * <br>Level: Easy
 * <br>Link: <a href = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">LeetCode 121</a>
 */
public class LeetCode121 {
    public int BigO;
    public int big1;
    /**
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day. You want to maximize your profit by choosing a single day to
     * buy one stock and choosing a different day in the future to sell that stock.
     *<br> Return the maximum profit you can achieve from this transaction. If you
     * cannot achieve any profit, return 0.
     *
     * <br>Example 1: Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2
     * (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying
     * on day 2 and selling on day 1 is not allowed because you must buy before you
     * sell.
     *
     * <br>Example 2: Input: prices = [7,6,4,3,1] Output: 0
     * <br>Explanation: In this case,
     * no transactions are done and the max profit = 0.
     *
     * <br>Constraints: 1 <= prices.length <= 105 0 <= prices[i] <= 104
     */
    public int maxProfit(int[] prices) {
        int result = 0;
        int maxvalue;
        for (int i = 0; i < prices.length - 1; i++) {  //prices = [7,1,5,3,6,4]
            BigO++;
            maxvalue = MaxValue(i +1 , prices);
            if(maxvalue - prices[i] > result) {
                result = maxvalue - prices[i];
            }
        }
        return result;
    }
    // Hàm hỗ trợ tìm số lớn nhất của mảng
    public int MaxValue(int index,int[] prices) {
        int result = prices[index];
        for (int i = index + 1 ; i < prices.length; i++) {
            BigO++;
            if(prices[i] > result ) {
                result = prices[i];
            }
        }
        return result;
    }

}
