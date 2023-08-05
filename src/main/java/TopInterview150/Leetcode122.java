package TopInterview150;
/**
 * {@code @Author:} hoangsang03 <br>
 * Title: 122. Best Time to Buy and Sell Stock II <br>
 * Level: <b>Medium</b> <br>
 * Link: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150">LeetCode122</a>
 */
public class Leetcode122 {
    /**
     * Constraints:
     * 1 <= prices.length <= 3 * 104
     * 0 <= prices[i] <= 104
     * @param prices : price array
     * @return : maxminum profit
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int top = 0;
        int bottom = prices[0];
        for (int price : prices) {
            if (top == 0) {
                if (price <= bottom) {
                    bottom = price;
                } else {
                    top = price;
                }
            } else {
                if (top <= price) {
                    top = price;
                } else {
                    maxProfit += top - bottom;
                    top = 0;
                    bottom = price;
                }
            }
        }
        /* check last transaction if it's able to have */
        maxProfit += top != 0 ? top - bottom : 0;
        return maxProfit;
    }
}
