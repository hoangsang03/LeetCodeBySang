package Top_Interview_Questions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Title: 121. Best Time to Buy and Sell Stock
 * <br> Difficult: Easy
 * <br> Link: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">best-time-to-buy-and-sell-stock</a>
 */
public class LeetCode121 {
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

    public int BigO = 0;

    public int maxProfit(int[] prices) {
        // find list min
        Map<Integer, Integer> mins = findMinsIndex(prices);

        if (mins.size() == 1) {
            if (mins.containsKey(0)) {
                return findMax(1, prices) - mins.get(0);
            } else {
                int index = mins.keySet().stream().findFirst().orElse(prices.length - 1);
                int result = findMax(index, prices) - mins.get(index);
                return Math.max(result, 0);
            }
        }


        int maxValue;
        int minValue;
        int minIndex;

        int maxProfit = 0;
        Map<Integer,Integer> maxValuaMap = new ConcurrentHashMap<>();
        int[] maxArr = new int[2];
        for (Map.Entry<Integer, Integer> entry : mins.entrySet()) {
            BigO++;
            minIndex = entry.getKey();
            minValue = entry.getValue();
            maxValue = isMaxValueExist(minIndex, maxValuaMap);

            if(maxValue == -1){
                maxArr = findMaxValueAndIndex(minIndex, prices);
                maxValue = maxArr[1];
                maxValuaMap.put(maxArr[0],maxArr[1]);
            }
            if(maxValue - minValue > maxProfit){
                maxProfit = maxValue - minValue;
            }
        }
        return maxProfit ;
    }

    private int isMaxValueExist(int minIndex, Map<Integer, Integer> maxValuaMap) {
        int maxValue = -1;
        if(maxValuaMap.size() > 0){
            for (int index: maxValuaMap.keySet()) {
                BigO++;
                if(index > minIndex){
                    maxValue = maxValuaMap.get(index);
                    break;
                }
            }
        }
        return maxValue;
    }

    private Map<Integer,Integer> findMinsIndex(int[] prices) {
        Map<Integer, Integer> mins = new ConcurrentHashMap<>();
        int minIndex = -1;
        mins.put(-1,Integer.MAX_VALUE);

        for (int i = 0; i < prices.length - 1; i = minIndex + 1) {
            BigO++;
            minIndex = findNextFinalMinIndex(mins.get(minIndex),i, prices);
            if(minIndex == prices.length){
                break;
            }
            mins.put(minIndex, prices[minIndex]);
        }
        mins.remove(-1);
        return mins;
    }

    private int findNextFinalMinIndex(int previousMin, int start, int[] prices) {
        int min = previousMin;
        for (int j = start; j < prices.length; j++) {
            BigO++;
            // got next min
            if (min > prices[j]) {
                min = prices[j];
                // find next sequence min if it has
                for (int i = j+1; i < prices.length; i++) {
                    BigO++;
                    if(min > prices[i]){
                        min = prices[i];
                    } else {
                        return i - 1;
                    }
                }
            }
        }
        // no have any min more
        return prices.length;
    }

    private int findMax(int start, int[] prices) {

        int max = prices[start];
        for (int i = start + 1; i < prices.length; i++) {
            BigO++;
            if (max < prices[i]) {
                max = prices[i];
            }
        }
        return max;
    }
    private int[] findMaxValueAndIndex(int start, int[] prices){
        int max = prices[start];
        int maxIndex = start;
        for (int i = start + 1; i < prices.length; i++) {
            BigO++;
            if (max < prices[i]) {
                max = prices[i];
                maxIndex = i;
            }
        }
        return new int[]{maxIndex,max};
    }
}
